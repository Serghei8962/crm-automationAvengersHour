package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
    private static WebDriver webDriver;
    public static void main(String[] args) {


        //TC02

        //Setup the "browser driver"
        //Go to "https://www.selenium.dev"
        setUpBrowserAndGoTo("https://www.selenium.dev");
        //Verify the title contains "Selenium"
        verifyingTitleContains("Selenium");

    }

    private static void verifyingTitleContains(String expectedWord) {
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contains(expectedWord)){
            System.out.println("Verification Title Passed");
        }else {
            System.err.println("Verification title Failed");
        }
    }


    private static void setUpBrowserAndGoTo(String url) {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }
}
