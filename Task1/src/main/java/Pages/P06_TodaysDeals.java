package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.utils;

public class P06_TodaysDeals {
    private WebDriver driver;
    private final By SeeMoreButton = By.xpath("//a[text()='See more']");
    private final By DepartmentCheck = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[2]/div/span[12]/div/label/span"); //Because Headphones & Grocery doesn't Exist.
    private final By DiscountCheck = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[4]/div/span[2]/div/label/span/span");
    private final By ChosenItem = By.linkText("ANRABESS Women 2 Piece Outfits Sweatsuit Oversiz…");

    public P06_TodaysDeals(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterDeals() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utils.clickingOnElement(driver, SeeMoreButton);
        utils.clickingOnElement(driver, DepartmentCheck);
        utils.clickingOnElement(driver, DiscountCheck);
        utils.clickingOnElement(driver, ChosenItem);
        P03_ProductDetailsPage AddToCart = new P03_ProductDetailsPage(driver);
        AddToCart.addItemToCartScenarioTwo();
    }
}
