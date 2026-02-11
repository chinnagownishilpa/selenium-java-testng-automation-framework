package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Driver.DriverFactory;
import utils.ConfigReader;
import utils.ExtentManager;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;
    protected ExtentTest test;
    
    @BeforeMethod
    public void setUp() {
        extent = ExtentManager.getExtent();
        test = extent.createTest(this.getClass().getSimpleName());

        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @AfterSuite
    public void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
