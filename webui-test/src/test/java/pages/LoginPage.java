package pages;

import org.openqa.selenium.By;

import static helper.Utility.webDriver;

public class LoginPage {

    By inputUsername = By.id("user-name");
    By getInputPassword = By.id("password");
    By buttonLogin = By.id("login-button");
    By errorMessage = By.cssSelector("[data-test='error']");

    public void setInputUsername(String username) {

        webDriver.findElement(inputUsername).sendKeys(username);
    }

    public void setGetInputPassword(String password) {
        webDriver.findElement(getInputPassword).sendKeys(password);
        webDriver.findElement(buttonLogin).click();
    }

    public boolean isPageDisplayed() {
        webDriver.findElement(inputUsername).isDisplayed();
        webDriver.findElement(getInputPassword).isDisplayed();
        webDriver.findElement(buttonLogin).isDisplayed();
        return true;
    }
    public String getErrorMessage() {
        return webDriver.findElement(errorMessage).getText();
    }
}