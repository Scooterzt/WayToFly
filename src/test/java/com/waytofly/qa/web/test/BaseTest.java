package com.waytofly.qa.web.test;

import com.waytofly.qa.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver driver = null;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver = setupDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void teardown(){
        if (driver != null){
            driver.quit();
        }
    }

    private WebDriver setupDriver(){
        if (driver == null){
            return WebDriverUtil.getDriver();
        } else {
            return driver;
        }
    }
}
