package com.waytofly.qa.web.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class HomePageData {

    @DataProvider(name = "getCityData")
    public static Object[][] getCityData(){
        final List<Object[]> data = new ArrayList<>();

        data.add(
                new Object[]{
                        "New York"
                }
        );

        data.add(
                new Object[]{
                        "Los Angeles"
                }
        );

        return data.toArray(new Object[data.size()][]);
    }
}
