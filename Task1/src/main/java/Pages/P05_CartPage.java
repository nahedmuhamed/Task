package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utils;

public class P05_CartPage {
    private WebDriver driver;
    private final By itemName = By.tagName("h4");

    public P05_CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkItemVisibility() {
        try {
            return utils.findWebElement(driver, itemName).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}
