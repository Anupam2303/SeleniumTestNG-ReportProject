package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class IntSetup {
    public static WebDriver driver;

    public static WebDriver OpenBrowser() throws Exception {
        try {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.get(Constant.URL);
            System.out.println("Web application launched successfully");

        } catch (Exception e) {
            System.out.println("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
        }
        return driver;
    }

    @BeforeMethod
    public void beforeMethod(Method method) throws Exception {
        System.out.println("*******Start******" + method.getName() + "*******Start******");

    }

    @AfterMethod
    public void afterMethod(Method method) throws Exception {
        System.out.println("*******End******" + method.getName() + "*******End******");
    }

    @AfterClass
    public void afterClass() throws Exception {
        driver.close();
    }

}







//System.setProperty("webdriver.chrome.driver", "Driver/mac/chromedriver");
