package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utils;

public class P04_GoCartPage {

    private WebDriver driver;
    private final By goToCartButton = By.cssSelector("[data-csa-c-slot-id=\"sw-gtc\"]");

    public P04_GoCartPage(WebDriver driver) {
        this.driver = driver;
    }



    public P05_CartPage GoToCart() {
        utils.clickingOnElement(driver, goToCartButton);
        return new P05_CartPage(driver);

    }

    public By getGoToCartButton() {
        return goToCartButton;
    }
}

