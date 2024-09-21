package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.utils;


public class P01_Home {
    private WebDriver driver;
    private final By LeavingFrom = By.linkText("Select Departure City");
    private final By SearchBox1 = By.xpath("//*[@id=\"fromCity_chosen\"]/div/div[1]/input");
    private final By SearchBox2 = By.xpath("//*[@id=\"toCity_chosen\"]/div/div[1]/input");
    private final By GoingTo = By.linkText("Select Destination City");
    private final By Date = By.id("departDate");
    private final By ChosenDate = By.xpath("//a[@class='ui-state-default' and text()='1']");
    private final By SearchBuses = By.id("submitSearch");


    public P01_Home(WebDriver driver) {
        this.driver = driver;
    }

    public P02_SelectSeat EnterTravelDate(String key1, String key2) {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        utils.clickingOnElement(driver, LeavingFrom);
        utils.sendData(driver, SearchBox1, key1);
        driver.findElement(SearchBox1).sendKeys(Keys.ENTER);
        utils.clickingOnElement(driver, GoingTo);
        utils.sendData(driver, SearchBox2, key2);
        driver.findElement(SearchBox2).sendKeys(Keys.ENTER);
        utils.clickingOnElement(driver, Date);
        utils.clickingOnElement(driver, ChosenDate);
        utils.clickingOnElement(driver, SearchBuses);
        return new P02_SelectSeat(driver);
    }
}
