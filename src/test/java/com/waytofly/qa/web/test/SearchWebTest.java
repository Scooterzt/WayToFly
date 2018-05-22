package com.waytofly.qa.web.test;

import com.waytofly.qa.model.HomePage;
import com.waytofly.qa.web.data.HomePageData;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchWebTest extends BaseTest {

    private HomePage homepage = null;

    @Test(dataProvider = "getCityData", dataProviderClass = HomePageData.class)
    public void testHomePageEnterDeparture(final String city) {
        homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.visit();
        homepage.enterDepartureCity(city);
    }
}
