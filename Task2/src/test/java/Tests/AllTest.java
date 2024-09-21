package Tests;

import Pages.P01_Home;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AllTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @Test
    public void Test() {
        new TC01().ReserveATicket();
        new TC02().ValidatePhoneNumFormat();
        new TC03().ValidateEmailFormat();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}


