package automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    By usernameTxtBox = By.id("username");
    By passwordTxtBox = By.id("password");
    By loginButton = By.id("login");
    By authError = By.className("auth_error");

    public void loginWithUsernameAndPassword(String username, String password) {
        getDriver().findElement(usernameTxtBox).clear();
        getDriver().findElement(usernameTxtBox).sendKeys(username);

        getDriver().findElement(passwordTxtBox).clear();
        getDriver().findElement(passwordTxtBox).sendKeys(System.getenv(password));

        getDriver().findElement(loginButton).click();
    }

    public String getAuthErrorText() {
                return getDriver().findElement(authError).getText();
    }
}
