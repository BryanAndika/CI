package pages;

import org.openqa.selenium.By;

import static helper.Utility.webDriver;

public class HomePage {

    By iconShoppingChart = By.id("shopping_cart_container");

    public boolean verifyPageIsDisplayed(){
        webDriver.findElement(iconShoppingChart).isDisplayed();
        return true;
    }

}
