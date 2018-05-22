package com.waytofly.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
    public static WebDriver getDriver() {
        if(System.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("chromeDriverPath"));
            return new ChromeDriver();
        } else {
            throw new RuntimeException("Only chrome driver is supported");
        }
    }
}


