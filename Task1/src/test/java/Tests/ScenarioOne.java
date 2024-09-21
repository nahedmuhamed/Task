package Tests;

import Pages.P01_HomePage;
import Pages.P05_CartPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.utils;

public class ScenarioOne {
    WebDriver driver;
    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.com/");
        utils.waitForIamHuman(driver);
    }

    @Test
    public void checkThatItemAddedToCart()
    {
        new P01_HomePage(driver).searchForItem("car accessories")
                .clickOnFirstItem()
                .addItemToCartScenarioOne()
                .GoToCart();
        Assert.assertTrue(new P05_CartPage(driver).checkItemVisibility());
    }

    @AfterMethod
    public void quit()
    {
        driver.quit();
    }
}
