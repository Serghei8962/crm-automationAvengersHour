package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC08 {
    public static void main(String[] args) throws InterruptedException {

        //TC:8 As a user I should be able to see the password by using eye icon


        //1-open a chrome browser
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2-goto https://app.seamlessly.net/index.php/login
        webDriver.get("https://app.seamlessly.net/index.php/login");
        //3-enter password "UserUser123"
        WebElement passwordWebElement = webDriver.findElement(By.cssSelector("#password"));
        passwordWebElement.sendKeys("UserUser123");
        //4-verify password as "*****"
        String type = passwordWebElement.getAttribute("type");
        if (type.equals("password")){
            System.out.println("Password is hidden and PASSED");
        }else {
            System.err.println("Password is not Hidden and FAILED");
        }
        Thread.sleep(3000);
        //5-click eye icon
        webDriver.findElement(By.className("toggle-password")).click();
        //6-verify that password is shown
        type = passwordWebElement.getAttribute("type");
        if (type.equals("text")){
            System.out.println("Password is shown and PASSED");
        }else {
            System.err.println("Password is not shown and FAILED");
        }
        webDriver.close();


    }
}
