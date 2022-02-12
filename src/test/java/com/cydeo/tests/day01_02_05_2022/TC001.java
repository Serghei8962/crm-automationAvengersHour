package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
    public static void main(String[] args) throws InterruptedException {
        //Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //Go to "https://www.selenium.dev/"
        webDriver.get("https://www.selenium.dev/");
        //Verify the URL
        String actualUrl = webDriver.getCurrentUrl();
        if (actualUrl.equals("https://www.selenium.dev/")){
            System.out.println("Verification Passed");
        }else {
            System.out.println("Verification Failed");
        }
        Thread.sleep(2000);
        webDriver.close();
        System.out.println(9*100 + 1*50+ 49*20 + 31*10 + 24*5 + 85*1);
    }

}
