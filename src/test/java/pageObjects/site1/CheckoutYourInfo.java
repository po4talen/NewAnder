package pageObjects.site1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.getDriver;

public class CheckoutYourInfo {

    private static final By INPUT_FIRSTNAME = By.xpath("//input[@id='first-name']");
    private static final By INPUT_LASTNAME = By.xpath("//input[@id='last-name']");
    private static final By INPUT_ZIP = By.xpath("//input[@id='postal-code']");
    private static final By BUTTON_CONTINUE = By.xpath("//input[@id='continue']");


    public CheckoutYourInfo setFirstName(){
        getDriver().findElement(INPUT_FIRSTNAME).sendKeys("Igor");
        return this;
    }

    public CheckoutYourInfo setLastName(){
        getDriver().findElement(INPUT_LASTNAME).sendKeys("Test");
        return this;
    }

    public CheckoutYourInfo setZip(){
        getDriver().findElement(INPUT_ZIP).sendKeys("123");
        return this;
    }

    public CheckoutBillingPage clickContinue(){
        getDriver().findElement(BUTTON_CONTINUE).click();
        return new CheckoutBillingPage();
    }

}
