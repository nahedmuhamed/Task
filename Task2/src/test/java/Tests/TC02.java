package Tests;

import Pages.P01_Home;
import Pages.P03_Payments;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TC02 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @Test
    //Validate The mobile number and email format
    public void ValidatePhoneNumFormat() {
        new P01_Home(driver).EnterTravelDate("CHIKKAMAGALURU", "BENGALURU")
                .EnterOtherInfo()
                .LastData("011122", "Nahed@gmail.com", "Nahed", "23", "123123123");
        Assert.assertTrue(new P03_Payments(driver).PhoneValidation());

    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
