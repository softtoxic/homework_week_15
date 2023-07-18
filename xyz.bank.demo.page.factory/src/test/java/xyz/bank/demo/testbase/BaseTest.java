package xyz.bank.demo.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import xyz.bank.demo.propertyReader.PropertyReader;
import xyz.bank.demo.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeBrowser();
    }
}
