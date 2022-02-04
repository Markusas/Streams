package org.learning.test;

import org.learning.streams.base.BaseTest;
import org.learning.streams.pages.Home;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testHome extends BaseTest {
    Home home;


    @Test(dataProvider = "getData")
    public void testTable(String userName, String password) {
        home = new Home(driver);
        home.clickSortTable();
        Assert.assertEquals(home.getSortedList(), home.getOriginalList());
        home.getPrice("Apple");
        System.out.println(userName);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];

        data[0][0] = "firstUserName";
        data[0][1] = "firstPassword";

        data[1][0] = "secondUserName";
        data[1][1] = "secondPassword";

        data[2][0] = "thirdUserName";
        data[2][1] = "thirdPassword";


        return data;
    }
}
