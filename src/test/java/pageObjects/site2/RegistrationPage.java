package pageObjects.site2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.getDriver;

public class RegistrationPage {


    private static final By REG_LOGIN = By.xpath("//div[@id='main']//input[@name='Nik']");
    private static final By REG_PASSWORD = By.xpath("//div[@id='main']//input[@name='Password']");
    private static final By REG_EMAIL = By.xpath("//div[@id='main']//input[@name='Mail']");
    private static final By REG_SUBMIT = By.xpath("//div[@id='main']//input[@type='submit']");
    private static final By TEXT_AREA = By.xpath("//textarea[@placeholder='Текст новой записи']");

    public RegistrationPage enterRegLogin(String login){
        getDriver().findElement(REG_LOGIN).sendKeys(login);
        return this;
    }

    public RegistrationPage enterRegPassoword(String password){
        getDriver().findElement(REG_PASSWORD).sendKeys(password);
        return this;
    }

    public RegistrationPage enterRegEmail(String email){
        getDriver().findElement(REG_EMAIL).sendKeys(email);
        return this;
    }

    public RegistrationPage clickSubmitButton(){
        getDriver().findElement(REG_SUBMIT).click();
        return this;
    }

    public RegistrationPage checkIfAccountRegistered(){
        WebElement textarea = getDriver().findElement(TEXT_AREA);
        Assert.assertTrue(textarea.isDisplayed());
        return this;
    }

}
