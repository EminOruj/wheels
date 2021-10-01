package com.wheels.pages;

import com.wheels.utilities.BrowserUtils;
import com.wheels.utilities.Driver;
import com.wheels.utilities.BrowserUtils;
import com.wheels.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



        @FindBy(xpath = "//div[@class='content']/h1")
        public WebElement pageHeader;


    @FindBy(xpath = "//div[@class='module-title ng-star-inserted']//following-sibling::h1")
    public WebElement pageHeader2;

    @FindBy(xpath = "//a[.=' 855-FLY-8760 ']")
    public WebElement phoneN;

    @FindBy(xpath = "//a[.=' info@wheelsup.com ']")
    public WebElement emailAdd;

    @FindBy(xpath = "//span[contains(text(),'601 West 26th Street') or contains (text(),'New York, NY 10001')]")
    public WebElement address1;

    @FindBy(xpath = "//div[@class='menu-item']//following-sibling::a[.=' Fly ']")
    public WebElement flyTab;

    @FindBy(xpath = "//li[@class='ng-star-inserted'][3]/a")
    public WebElement coreMembership;

    @FindBy(xpath = "//h3[contains(text(),'SHARED FLIGHTS')]")
    public WebElement multiple;

    @FindBy(xpath = "//input[@id='FirstName-clone']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='LastName-clone']")
    public WebElement password;

    @FindBy(xpath = "//a[@class='button normal primary default typeB ng-star-inserted']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[contains(@href,'/request-info')]")
    public WebElement Requestlink;

    @FindBy(id = "Email-clone")
    public WebElement email;

    @FindBy(id = "Phone-clone")
    public WebElement phoneNumber;

    @FindBy (id = "Company__c-clone")
    public WebElement companyName;

    @FindBy (id = "Address-clone")
    public WebElement address2;

    @FindBy(id = "City-clone")
    public WebElement city;

    @FindBy(id = "PostalCode-clone")
    public WebElement zipCode;

    @FindBy(id = "State-clone")
    public WebElement state;

    @FindBy(id = "Country-clone")
    public WebElement country ;

    @FindBy(xpath = "//p[.='Please select one']")
    public WebElement dropdown1;

  //locator for 1dropdown












    }


