package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By login = By.cssSelector(".fa");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        driver.findElement(username).sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        driver.findElement(password).sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        driver.findElement(login).click();
        return new MainPage(driver);
    }
}
