package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC06 {
    public static void main(String[] args) {

       // TC:6 As a user I should be able to see the password as "*******"

        //1-open a chrome browser
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        //2-goto https://vytrack.com/
        webDriver.get("https://vytrack.com/");
        //3-click Login label
        WebElement logInWebElement = webDriver.findElement(By.xpath("//ul[@id='top-menu']/li[6]/a"));
        logInWebElement.click();

        //4-enter username "User1"
        WebElement usernameWebElement = webDriver.findElement(By.id("prependedInput"));
        usernameWebElement.sendKeys("User1");
                //5-enter password "UserUser123"
        WebElement passwordWebElement = webDriver.findElement(By.name("_password"));
        passwordWebElement.sendKeys("UserUser123");
        //6-verify the password is hidden;
        String type = passwordWebElement.getAttribute("type");
        if (type.equals("password")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        webDriver.close();
    }
}
