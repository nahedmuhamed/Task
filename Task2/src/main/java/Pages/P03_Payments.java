package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.utils;

public class P03_Payments {
    WebDriver driver;
    //NOTE: I used xpath alot because there's no id, and it doesn't work when im using any other locator even when linktext is unique.
    private final By MobileNum = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/input[2]");
    private final By Email = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/input[2]");
    private final By PassengerDetails = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]");
    private final By Name = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[2]/input[2]");
    private final By Gender = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/input");
    private final By ChosenGender = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]");
    private final By Age = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/input");
    private final By Concession = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/input");
    private final By ChosenConcession = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]/div");
    private final By IdCard = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/input");
    private final By IdCardType = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[3]/div");
    private final By IdCardNo = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[7]/input[2]");
    private final By PhoneErrorMessage = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/span");
    private final By EmailErrorMessage = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/span");

    public P03_Payments(WebDriver driver) {
        this.driver = driver;
    }

    public void LastData(String mobile, String email, String name, String age, String Id2) {
        utils.clickingOnElement(driver, MobileNum);
        utils.sendData(driver, MobileNum, mobile);
        utils.clickingOnElement(driver, Email);
        utils.sendData(driver, Email, email);
        utils.clickingOnElement(driver, PassengerDetails);
        utils.clickingOnElement(driver, Name);
        utils.sendData(driver, Name, name);
        utils.clickingOnElement(driver, Gender);
        utils.clickingOnElement(driver, ChosenGender);
        utils.clickingOnElement(driver, Age);
        utils.sendData(driver, Age, age);
        utils.clickingOnElement(driver, Concession);
        utils.clickingOnElement(driver, ChosenConcession);
        utils.clickingOnElement(driver, IdCard);
        utils.clickingOnElement(driver, IdCardType);
        utils.clickingOnElement(driver, IdCardNo);
        utils.sendData(driver, IdCardNo, Id2);
    }
    public boolean PhoneValidation() {
        try {
            return utils.findWebElement(driver, PhoneErrorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean EmailValidation() {
        try {
            return utils.findWebElement(driver, EmailErrorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
