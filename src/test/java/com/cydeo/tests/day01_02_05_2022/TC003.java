package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003 {
    private static WebDriver webDriver;
    public static void main(String[] args) {

       // TC03
        //Setup the "browser driver"
        webDriver("https://www.google.com");

        //Go to "https://www.google.com"

        //Verify the title contains "Google";
        webdriverContainsTitle("Google");

        //Navigate to "https://www.etsy.com"
        goToThisWebsite("https://www.etsy.com");

        //Verify not in google page

        //Verify the title  contains "Etsy"
        verifyingTitle("Etsy");

    }

    private static void verifyingTitle(String expectedWord) {
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contains(expectedWord)){
            System.out.println("verifying Title passed");
        }else {
            System.err.println("Verifying title failed");
        }
    }

    private static void goToThisWebsite(String url) {
        webDriver.navigate().to(url);
    }

    private static void webdriverContainsTitle(String expectedWord) {
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contains(expectedWord)){
            System.out.println("Verification Title passed");
        }else {
            System.err.println("Verification title Failed");
        }
    }

    private static void webDriver(String URL) {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(URL);
    }
}
