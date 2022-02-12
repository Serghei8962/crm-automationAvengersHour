package com.cydeo.tests.day02_02_12_2022;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC01 {
    public static void main(String[] args) {

       // AC(Acceptance Criteria):1 As a user I should be able to see Home is displayed

        //1-open a chrome browser
        WebDriver webDriver = WebDriverFactory.getDriver("chrome");
        //2-goto https://vytrack.com/
        webDriver.get("https://vytrack.com/");
        //webDriver.navigate().to("https://vytrack.com/");
        //3-verify Home is displayed
        WebElement homeWebElement = webDriver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        if (homeWebElement.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.err.println("Failed");
        }
        // WebElement homeElement = webDriver.findElement();




    }
}
