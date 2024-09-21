package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utils;

import java.lang.foreign.SymbolLookup;
import java.lang.ref.PhantomReference;

public class P02_SelectSeat {
    WebDriver driver;
    //NOTE: I used xpath alot because there's no id, and it doesn't work when im using any other locator even when linktext is unique.
    private final By SeatButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div[5]/div[7]/div");
    private final By ChosenSeat = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[5]");
    private final By Boarding = By.linkText("Select Boarding Point");
    private final By Dropping = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]");
    private final By BoardingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]");
    private final By DroppingPoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/div[2]");
    private final By ProvideDetails = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]");

    public P02_SelectSeat(WebDriver driver) {
        this.driver = driver;
    }

    public P03_Payments EnterOtherInfo() {
        utils.clickingOnElement(driver, SeatButton);
        utils.clickingOnElement(driver, ChosenSeat);
//        utils.clickingOnElement(driver,Boarding);
        utils.clickingOnElement(driver, BoardingPoint);
        utils.clickingOnVisible(driver, Dropping);
        utils.clickingOnElement(driver, DroppingPoint);
        utils.clickingOnElement(driver, ProvideDetails);
        return new P03_Payments(driver);
    }


}
