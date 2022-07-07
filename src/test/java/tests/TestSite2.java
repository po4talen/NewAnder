package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.site2.HomePage;

import static driverManager.DriverManager.getDriver;

public class TestSite2 {

    private static final String URL = "https://diary.anek.ws/";

    @Before
    public void setUrl(){
            getDriver().get(URL);
        }

    @After
    public void closeDriver(){
        getDriver().close();
    }

    @Test
    public void LoginAndSaveMessage(){
        HomePage homePage = new HomePage();
        homePage
                .setLogin()
                .setPassoword()
                .pressSubmitButton()
                .enterTextInTextArea()
                .clickSaveButton()
                .checkIfMessageSaved();
    }

    @Test
    public void RegisterAccount(){
        HomePage homePage = new HomePage();
        homePage
                .clickRegisterUrl()
                .enterRegLogin("IgorTest123")
                .enterRegPassoword("12345678")
                .enterRegEmail("test@gmail.com")
                .clickSubmitButton()
                .checkIfAccountRegistered();
    }
}
