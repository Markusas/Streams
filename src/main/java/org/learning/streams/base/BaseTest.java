package org.learning.streams.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    String url;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
