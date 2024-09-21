package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utils;

public class P02_ItemsPage {
    private WebDriver driver;
    private final By firstItem = By.xpath("(//div[@data-cy=\"title-recipe\"] /h2 /a )[5]");

    public P02_ItemsPage(WebDriver driver) {
        this.driver = driver;
    }

    public P03_ProductDetailsPage clickOnFirstItem() {
        utils.clickingOnVisible(driver, firstItem);
        return new P03_ProductDetailsPage(driver);

    }

}
