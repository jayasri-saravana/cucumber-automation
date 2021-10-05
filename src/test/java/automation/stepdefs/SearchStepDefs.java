package automation.stepdefs;

import automation.pageobjects.SearchPage;
import automation.pageobjects.SelectPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDefs {
    SearchPage searchPage;
    SelectPage selectPage;


    @When("user selects {string} from location")
    public void userSelectsFromLocation(String location) {
        searchPage.selectLocation(location);
    }

    @When("user selects {string} from Hotel")
    public void userSelectsFromHotel(String hotel) {
        searchPage.selectHotel(hotel);
    }

    @When("user selects {string} from roomType")
    public void userSelectsFromRoomType(String roomType) {
        searchPage.selectRoomType(roomType);
    }

    @When("user selects {string} from noOfRoom")
    public void userSelectsFromNoOfRoom(String noOfRoom) {
        searchPage.selectNumberOfRooms(noOfRoom);
    }

    @When("user selects {string} from checkInDate")
    public void userSelectsFromCheckInDate(String checkInDate) {
        searchPage.getCheckInDate(checkInDate);
    }

    @When("user selects {string} from checkOutDate")
    public void userSelectsFromCheckOutDate(String checkOutDate) {
        searchPage.getCheckOutDate(checkOutDate);
    }

    @When("user selects {string} from adultsPerRoom")
    public void userSelectsFromAdultsPerRoom(String adultsPerRoom) {
        searchPage.selectAdultPerRoom(adultsPerRoom);
    }

    @When("user selects {string} from childrenPerRoom")
    public void userSelectsFromChildrenPerRoom(String childrenPerRoom) {
        searchPage.selectChildrenPerRoomRooms(childrenPerRoom);

    }

    @When("user clicks on Search button")
    public void clickSearch() {
        searchPage.clickSearch();
    }

    @Then("select hotel page should be displayed")
    public void selectHotelPageShouldBeDisplayed() {

        Assert.assertEquals("The Page title should be ", "Adactin.com - Select Hotel", selectPage.getTitle());
    }

    @Then("Error Message - Please Select Location should be displayed")
    public void selectLocationerrorMessageShouldBeDisplayed() {
        Assert.assertEquals("Select Location Error Message should be displayed ", "Please Select a Location", searchPage.getLocationErrorMessage());
    }
    @Then("Error Message - Please Select Total Number of Rooms should be displayed")
    public void selectTotalNumberOfRoomErrorMsgShouldBeDisplayed(){
        Assert.assertEquals("Select Total Number of Rooms should be displayed", "Please Select Total Number of Rooms", searchPage.getNumberOfRoomsErrorMessage());
    }
    @Then("Error Message - Please Select Check-In-date should be displayed")
    public void selectCheckInDateErrorMsgShouldBeDisplayed(){
        Assert.assertEquals("Select Check-In-Date should be displayed", "Please Select Check-In Date", searchPage.getCheckInDateErrorMessage());
    }
    @Then("Error Message - Please Select Check-Out-date should be displayed")
    public void selectCheckOutDateErrorMsgShouldBeDisplayed(){
        Assert.assertEquals("Select Check-Out-Date should be displayed", "Please Select Check-Out Date", searchPage.getCheckOutDateErrorMessage());
    }
    @Then("Error Message - Please Select Adults Per Room should be displayed")
    public void selectAdultPerRoomErrorMsgShouldBeDisplayed(){
        Assert.assertEquals("Select Adults Per Room should be displayed", "Please Select Adults per Room", searchPage.getAdultsPerRoomErrorMessage());
    }

}
