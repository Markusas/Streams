package org.learning.streams.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Home {
    WebDriver driver;
    List<String> originalList;
    List<String> sortedList;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//th[@role='columnheader']//span[contains(text(),'Veg/fruit name')]")
    WebElement sortButton;

    @FindBy(xpath = "//tbody//tr/td[1]")
    List<WebElement> elementList;

    public List<String> getOriginalList() {
        return originalList;
    }

    public List<String> getSortedList() {
        return sortedList;
    }


    public void clickSortTable() {
        sortButton.click();
        originalList = elementList.stream().map(WebElement::getText).collect(Collectors.toList());
        sortedList = originalList.stream().sorted().collect(Collectors.toList());
    }
}
