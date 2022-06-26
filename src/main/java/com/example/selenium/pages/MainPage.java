package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private final By title = By.cssSelector("h2");
    private final By logout = By.linkText("Logout");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void clickLogout() {
        driver.findElement(logout).click();
    }
}
