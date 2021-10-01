package com.wheels.tests;

import com.wheels.pages.BasePage;
import com.wheels.utilities.BrowserUtils;
import com.wheels.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class tasks {
    WebDriver driver;
    BasePage obj = new BasePage();

    /**
     * Navigate to https://wheelsup.com
     * - Find and print out in the console the following title “Flying, Personalized”
     * - Scroll down and print out in the console “Discover The Possibilities”
     * - Scroll to the bottom, print out phone number, email(Contact Us), and address(Find Us)
     * - Scroll to top
     * - Header menu, click “Fly” and then “CORE MEMBERSHIP”
     * - Scroll to section “Private aviation meets Social Aviation”
     * - Print out in the console “SHARED FLIGHTS”, “SHUTTLE FLIGHTS” and “HOT
     * FLIGHTS”
     * - Scroll to bottom -> “Learn more today” section (Enter first and last name)
     * - Click continue
     * - Validate url contains (request-info)
     * - Enter the respective data to all fields (request-info) - DO NOT CLICK SUBMIT
     * - Clich “X” at the top right corner
     */

    @BeforeTest

    public void closeBrowser() {
        Driver.getDriver().get("https://wheelsup.com/");
    }

    @Test
    public void test1() {
        BrowserUtils.sleep(3);
        System.out.println(obj.pageHeader.getText());
        BrowserUtils.sleep(2);
        System.out.println(obj.pageHeader2.getText());
        System.out.println(obj.phoneN.getText());
        System.out.println(obj.emailAdd.getText());
        System.out.println(obj.address1.getText());
    }
    @Test
    public void test2(){
        obj.flyTab.click();
        BrowserUtils.sleep(2);
        obj.coreMembership.click();

    }

    @Test
    public void test3() {
        BrowserUtils.sleep(2);
        obj.username.sendKeys("Emin");
        obj.password.sendKeys("Oruj");
        BrowserUtils.sleep(2);
        obj.continueButton.click();
    }
        @Test
       public void test4(){
        BrowserUtils.sleep(2);
            System.out.println(obj.Requestlink.getText());
            Assert.assertTrue(obj.Requestlink.isEnabled());

    }

    @Test
    public void test5(){
        obj.email.sendKeys("emin.oruj@aol.com");
        obj.phoneNumber.sendKeys("929-693-4344");
        obj.companyName.sendKeys("wheelsup");
        obj.address2.sendKeys("601 W26, NY,NY");
        obj.city.sendKeys("New York");
        obj.zipCode.sendKeys("10001");
        BrowserUtils.sleep(1);
        obj.state.sendKeys("NY");
        obj.country.sendKeys("USA");
        BrowserUtils.sleep(1);
        obj.dropdown1.click();

    }

    /*
    dropdown not working
     */
}
