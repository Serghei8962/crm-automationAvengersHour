package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {
        // 1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();


        // 2- Create instance of the Selenium WebDriver, this is the line opening an empty browser
        WebDriver webDriver = new ChromeDriver();

        // 3- Maximize the browser size
        webDriver.manage().window().maximize();

        // 4- Go to "https://www.selenium.dev"
        webDriver.get("https://www.selenium.dev");
        Thread.sleep(2000);

        // 5- Get the title of the page
        String actualTitle = webDriver.getTitle();
        Thread.sleep(2000);

        // 6- Get the URL of the page
        String actualUrl = webDriver.getCurrentUrl();
        Thread.sleep(2000);

        // 7- Use selenium to navigate back
            webDriver.navigate().back();
            Thread.sleep(2000);

        // 8- Use selenium to navigate forward
            webDriver.navigate().forward();
             Thread.sleep(2000);

        // 9- Use selenium to navigate refresh
            webDriver.navigate().refresh();
            Thread.sleep(2000);

        // 10- Use navigate().to() "https://www.etsy.com":
            webDriver.navigate().to("https://www.etsy.com");
            Thread.sleep(2000);

        // 11- Close the currently opened window
            webDriver.close();
            Thread.sleep(2000);

        // 12- Close all the opened windows
            webDriver.quit();

    }
}
