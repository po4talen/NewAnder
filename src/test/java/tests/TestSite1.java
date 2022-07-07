package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.site1.LoginPage;
import static driverManager.DriverManager.*;

public class TestSite1 {
    private static final String URL = "https://www.saucedemo.com";

    @Before
    public void setUrl(){
        getDriver().get(URL);
    }


    @After
    public void closeDriver(){
        getDriver().close();
    }

    @Test
    public void autorizationCheckout(){
        LoginPage loginPage = new LoginPage();
    loginPage
            .enterLogin()
            .enterPassword()
            .clickLoginButton()
            .addFirstItem()
            .goToShoppingCart()
            .clickCheckoutButton()
            .setFirstName()
            .setLastName()
            .setZip()
            .clickContinue()
            .clickFinishButton()
            .checkThatOrderIsPlaced();
    }
}
