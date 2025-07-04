package org.example.testsrun;

import org.example.factory.BrowserFactory;
import org.example.pages.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class FirstTestCase {
    WebDriver driver;
    Elements elements;

    @Before
    public void setUp() {
        driver = BrowserFactory.startBrowser("chrome");
        elements = new Elements(driver);
    }

    @Test
    public void fillTextBoxForm() {
        driver.get("https://demoqa.com/text-box");

        assertTrue("Username input should be enabled", elements.userName.isEnabled());

        elements.userName.sendKeys("For Testing");
        elements.userEmail.sendKeys("testing@example.com");
        elements.currentAddress.sendKeys("Sofia, Bulgaria");
        elements.permanentAddress.sendKeys("Same as above");
        elements.submitButton.click();


    }

    @After
    public void tearDown() {
        BrowserFactory.quitBrowser();
    }
}
