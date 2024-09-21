package Tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.utils;

public class TCs {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.com/");
        utils.waitForIamHuman(driver);
    }

    @Test
    public void Test() {
        new ScenarioOne().checkThatItemAddedToCart();
        new ScenarioTwo().AddItemFromTodaysDeals();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
