package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    WebDriver driver;

    public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#userName")
    public WebElement userName;

    @FindBy(css = "#userEmail")
    public WebElement userEmail;

    @FindBy(css = "#currentAddress")
    public WebElement currentAddress;

    @FindBy(css = "#permanentAddress")
    public WebElement permanentAddress;

    @FindBy(css = "#submit")
    public WebElement submitButton;

}
