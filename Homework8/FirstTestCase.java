package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abi99\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.cssSelector("#userName")).sendKeys("For Testing");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("testing@example.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Sofia, Bulgaria");
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Same as above");
        WebElement button = driver.findElement(By.cssSelector("#submit"));
        button.click();
    }
}
