package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC03 {
    public static void main(String[] args) {


        //TC:3 As a user I should be able to see Contact is displayed

        //1-open a chrome browser
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        //2-goto https://vytrack.com/
        webDriver.get("https://vytrack.com/");

        //3-verify Contact is displayed and label is "Contact"
        WebElement contactWebElement = webDriver.findElement(By.xpath("//ul[@id='top-menu']//*[contains(@href,'contact')]"));
        if (contactWebElement.isDisplayed()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        webDriver.close();
    }
}
