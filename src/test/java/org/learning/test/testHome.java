package org.learning.test;

import org.learning.streams.base.BaseTest;
import org.learning.streams.pages.Home;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHome extends BaseTest {
    Home home;

    @Test
    public void testTable() {
        home = new Home(driver);
        home.clickSortTable();
        Assert.assertEquals(home.getSortedList(), home.getOriginalList());
        home.getPrice("Apple");
    }
}
