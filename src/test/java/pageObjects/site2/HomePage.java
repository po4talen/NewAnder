package pageObjects.site2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static driverManager.DriverManager.getDriver;
public class HomePage {

    private static final By LOGIN = By.xpath("//input[@id='Nik']");
    private static final By PASSWORD = By.xpath("//input[@id='Password']");
    private static final By BUTTON_SUBMIT = By.xpath("//input[@id='login_subm']");
    private static final By REGISTRAITION_URL = By.xpath("//div/a[@id='registr']");



    public HomePage setLogin(){
        getDriver().findElement(LOGIN).sendKeys("vikwork23");
        return this;
    }

    public HomePage setPassoword(){
        getDriver().findElement(PASSWORD).sendKeys("dovUdmI7IU");
        return this;
    }

    public DairyPage pressSubmitButton(){
        getDriver().findElement(BUTTON_SUBMIT).click();
        return new DairyPage();
    }

    public RegistrationPage clickRegisterUrl(){
        getDriver().findElement(REGISTRAITION_URL).click();
        return new RegistrationPage();
    }




}
