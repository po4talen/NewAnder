package pageObjects.site1;

import org.openqa.selenium.By;

import static driverManager.DriverManager.*;

public class LoginPage {

    //private static final String URL = "https://www.saucedemo.com";
    private static final By LOGIN = By.xpath("//input[@id='user-name']");
    private static final By PASSWORD = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");


//    public LoginPage openUrl(String url){
//        getDriver().get(url);
//        return this;
//    }

    public LoginPage enterLogin() {
        getDriver().findElement(LOGIN).sendKeys("standard_user");
        return this;
    }

    public LoginPage enterPassword() {
        getDriver().findElement(PASSWORD).sendKeys("secret_sauce");
        return this;
    }

    public Inventory clickLoginButton(){
        getDriver().findElement(LOGIN_BUTTON).click();
        return new Inventory();
    }
}




