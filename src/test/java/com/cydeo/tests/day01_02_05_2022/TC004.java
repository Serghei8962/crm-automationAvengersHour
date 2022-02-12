package com.cydeo.tests.day01_02_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004 {
    private static WebDriver webDriver;
    public static void main(String[] args) {

        //- Go to "https://app.vytrack.com/user/login"
        foreachVerification("https://app.vytrack.com/user/login");

        //- Verify the url contains "vytrack"
        verifyingUrlContains("vytrack");

        //- Verify the title contains "Login"
        verifyingTitle("Login");


        //- Verify the label "Login"
        verifyingLabel("Login");
            //login
        login("abcd", "abcd");

        //- Verify the message "Invalid username or password"
        verifyingLogIn("expectedMessage");



    }

    private static void verifyingLogIn(String expectedMessage) {
        WebElement actualMessage = webDriver.findElement(By.className("alert"));
        actualMessage.getText();
        if (actualMessage.equals(expectedMessage)){
            System.out.println("Verification Message Passed");
        }else {
            System.err.println("Verfication Message Failed");
        }

    }


    private static void login(String username, String password) {
        WebElement usernameWebElement = webDriver.findElement(By.name("_username"));
        usernameWebElement.sendKeys(username);
        WebElement passwordWebElement = webDriver.findElement(By.id("prependedInput2"));
        passwordWebElement.sendKeys(password);
        //click LogIn button
        webDriver.findElement(By.id("_submit")).click();



    }

    private static void verifyingLabel(String expectedLabelText) {
     WebElement labelElement = webDriver.findElement(By.className("title"));
        String actualLabelText = labelElement.getText();
        if (actualLabelText.equals(expectedLabelText)){
            System.err.println("Verification Label Passed");
        }else {
            System.err.println("Verification Label Failed");
        }
    }

    private static void verifyingTitle(String expectedWord) {

        String actualTitle = webDriver.getTitle();
        if (actualTitle.contains(expectedWord)){
            System.out.println("Verification passed");
        }else {
            System.err.println("Verification failed");
        }
    }

    private static void verifyingUrlContains(String expectedWord) {

        String actualUrl  = webDriver.getCurrentUrl();
        if (actualUrl.contains(expectedWord)){
            System.out.println("Verification Passed");
        }else {
            System.err.println("Verification Failed");
        }
    }

    private static void foreachVerification(String  url) {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
    }
}
