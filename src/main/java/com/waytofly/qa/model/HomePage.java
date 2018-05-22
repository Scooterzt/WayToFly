package com.waytofly.qa.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    private static String URL = "https://www.waytofly.com/";

    @FindBy(how = How.XPATH, using = "//*[@id=\"flight-search-1\"]/form/div/div[2]/div/div[1]/div[2]/span/input[2]")
    protected WebElement searDeparture;

//    @FindBy(how = How.XPATH, using = "//*[@id=\\\"flight-search-1\\\"]/form/div/div[2]/div/div[1]/div[2]/span/input[2]")
//    protected WebElement searArive;

    public HomePage(final WebDriver d){
        super(d);
    }

    public void visit(){
        driver.get(URL);
    }

    public void enterDepartureCity(final String city){
        waitToBeClickable(searDeparture);
        sendTextToInputBox(searDeparture, city);
    }
}
