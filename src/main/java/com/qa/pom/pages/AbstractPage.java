package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    BaseTest testClass;

    //
    // Web elements with @FindBy annotation
    //
    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginLink;

    @FindBy(xpath = "//div[@id='page']")
    WebElement pageDiv;

    @FindBy(xpath ="//ul[contains(@class,'tree dynamized')]/li[position()=3]/a[contains(@title,'Short dress') and contains(text(),'Summer Dresses')]")
    WebElement summerDresses;
    @FindBy(xpath = "//ul[contains(@class,'sf-menu')]/li[position()=2]/a[contains(@title,'Dresses')]")
    WebElement dresses;
    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    WebElement submitButton;

    @FindBy(xpath = "//a[@class='logout']")
    WebElement logOutButton;
    @FindBy (xpath = "//input[contains(@style,'#434A54')]")
    WebElement blackColor;
    /** Constructor */
    AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this); // Initialize WebElements
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Click on Log in button and get instance of page
     *
     * @return LogInPage
     */
    public Login clickLoginLink() {
        testClass.waitTillElementIsVisible(loginLink);
        loginLink.click();
        return new Login(testClass);
    }

    /** Check log in page after log out */
    public Login signOut() {
        logOutButton.click();
        return new Login(testClass);
    }
}
