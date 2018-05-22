package com.waytofly.qa.model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

class BasePage {

    WebDriver driver;

    private Wait<WebDriver> fluentWait;

    BasePage(final WebDriver driver) {
        this.driver = driver;
        this.fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1));
    }

    void sendTextToInputBox(final WebElement element, final String text){
        Actions actions = new Actions(driver);
        actions.click(element).sendKeys(text).perform();
        actions.sendKeys(Keys.TAB).perform();
    }

    void waitToBeClickable(final WebElement element){
        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
