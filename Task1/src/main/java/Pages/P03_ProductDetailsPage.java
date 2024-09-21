package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.utils;


public class P03_ProductDetailsPage {
    private WebDriver driver;
    private final By addToCartButton = By.id("add-to-cart-button");
    private final By SelectButton = By.xpath("//span[text()='    Select     ']");
    private final By SelectSizeButton = By.xpath("//li[@id='size_name_4' and @role='option']");

    public P03_ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public P04_GoCartPage addItemToCartScenarioOne() {
        utils.clickingOnElement(driver, addToCartButton);
        return new P04_GoCartPage(driver);
    }

    public void addItemToCartScenarioTwo() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        utils.clickingOnElement(driver, SelectButton);
        utils.clickingOnElement(driver, SelectSizeButton);
        utils.clickingOnElement(driver, addToCartButton);
    }

}
