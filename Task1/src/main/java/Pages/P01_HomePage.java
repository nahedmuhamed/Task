package Pages;

import org.openqa.selenium.*;
import utilities.utils;

public class P01_HomePage {
    private WebDriver driver;
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By DismissButton = By.xpath("//input[@data-action-type=\"DISMISS\" and @type=\"submit\"]");
    private final By DealsButton = By.linkText("Today's Deals");


    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public P02_ItemsPage searchForItem(String key) {
        utils.sendData(driver, searchBox, key);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
        return new P02_ItemsPage(driver);
    }

    public P06_TodaysDeals SearchForDeals() {
        utils.clickingOnVisible(driver, DismissButton);
        utils.clickingOnElement(driver, DealsButton);
        return new P06_TodaysDeals(driver);
    }

}

