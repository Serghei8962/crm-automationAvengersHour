package com.cydeo.tests.day02_02_12_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC05 {
    public static void main(String[] args) throws InterruptedException {

       // TC:5 As a user I should be able to see the login page

        //1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        webDriver.get("https://vytrack.com/");

        //3-click Login label
        WebElement logInWebElement = webDriver.findElement(By.xpath("//ul[@id='top-menu']/li[6]/a"));
        Thread.sleep(3000);
        logInWebElement.click();
        //4-verify the url contains login

        String currentUrl = webDriver.getCurrentUrl();
       if (currentUrl.contains("login")){
           System.out.println("Passed");
       }else {
           System.err.println("failed");
       }
webDriver.close();


    }
}
