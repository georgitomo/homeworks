package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi99\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fillTextBoxForm() {
        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.cssSelector("#userName"));
        assertTrue("Username input should be enabled", userName.isEnabled());
        WebElement userEmail = driver.findElement(By.cssSelector("#userEmail"));
        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        WebElement button = driver.findElement(By.cssSelector("#submit"));
        

        userName.sendKeys("For Testing");
        userEmail.sendKeys("testing@example.com");
        currentAddress.sendKeys("Sofia, Bulgaria");
        permanentAddress.sendKeys("Same as above");
        button.click();
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
