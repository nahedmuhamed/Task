package Tests;

import Pages.P01_Home;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC01 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @Test
    public void ReserveATicket() {
        new P01_Home(driver).EnterTravelDate("CHIKKAMAGALURU", "BENGALURU")
                .EnterOtherInfo()
                .LastData("6789125987", "Nahed@gmail.com", "Nahed", "23", "123123123");
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}


