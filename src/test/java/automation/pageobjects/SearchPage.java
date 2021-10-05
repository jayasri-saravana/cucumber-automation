package automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.google.common.base.Strings.isNullOrEmpty;

public class SearchPage extends PageObject {
    By locationDropDown = By.id("location");
    By hotelsDropDown = By.id("hotels");
    By roomTypeDropDown = By.id("room_type");
    By numberOfRoomsDropDown = By.id("room_nos");
    By checkInDateTxtBox = By.id("datepick_in");
    By checkOutDateTxtBox = By.id("datepick_out");
    By adultsPerRoomDropDown = By.id("adult_room");
    By childrenPerRoomDropDown = By.id("child_room");
    By searchButton = By.id("Submit");
    By locationErrorMessage = By.id("location_span");
    By noOfRoomsErrorMessage = By.id("num_room_span");
    By checkInDateErrorMessage = By.id("checkin_span");
    By checkOutDateErrorMessage = By.id("checkout_span");
    By adultsPerRoomErrorMessage = By.id("adults_room_span");

    public void selectLocation(String location) {
        Select locationDropDwn = new Select(getDriver().findElement(locationDropDown));
        locationDropDwn.selectByVisibleText(location);
    }

    public void selectHotel(String hotel) {
        if (!isNullOrEmpty(hotel)) {
            Select hotelDropDwn = new Select(getDriver().findElement(hotelsDropDown));
            hotelDropDwn.selectByVisibleText(hotel);
        }
    }

    public void selectRoomType(String roomType) {
        Select roomTypeDropDwn = new Select(getDriver().findElement(roomTypeDropDown));
        roomTypeDropDwn.selectByVisibleText(roomType);
    }

    public void selectNumberOfRooms(String noOfRooms) {
        Select noOfRoomDropDwn = new Select(getDriver().findElement(numberOfRoomsDropDown));
        noOfRoomDropDwn.selectByValue(noOfRooms);
    }

    public void getCheckInDate(String checkInDAte) {
        getDriver().findElement(checkInDateTxtBox).clear();
        getDriver().findElement(checkInDateTxtBox).sendKeys(checkInDAte);
    }

    public void getCheckOutDate(String checkOutDate) {
        getDriver().findElement(checkOutDateTxtBox).clear();
        getDriver().findElement(checkOutDateTxtBox).sendKeys(checkOutDate);
    }

    public void selectAdultPerRoom(String adultPerRoom) {
        Select adultPerRoomDropDwn = new Select(getDriver().findElement(adultsPerRoomDropDown));
        adultPerRoomDropDwn.selectByValue(adultPerRoom);
    }

    public void selectChildrenPerRoomRooms(String childrenPerRoom) {
        Select childrenPerRoomDropDwn = new Select(getDriver().findElement(childrenPerRoomDropDown));
        childrenPerRoomDropDwn.selectByValue(childrenPerRoom);
    }

    public void clickSearch() {
        getDriver().findElement(searchButton).click();
    }

    public String getLocationErrorMessage() {
        return getDriver().findElement(locationErrorMessage).getText();
    }

    public String getNumberOfRoomsErrorMessage() {
        return getDriver().findElement(noOfRoomsErrorMessage).getText();
    }
    public String getCheckInDateErrorMessage() {
        return getDriver().findElement(checkInDateErrorMessage).getText();
    }
    public String getCheckOutDateErrorMessage() {
        return getDriver().findElement(checkOutDateErrorMessage).getText();
    }
    public String getAdultsPerRoomErrorMessage() {
        return getDriver().findElement(adultsPerRoomErrorMessage).getText();
    }



}
