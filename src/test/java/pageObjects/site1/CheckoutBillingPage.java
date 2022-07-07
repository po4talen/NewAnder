package pageObjects.site1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.getDriver;

public class CheckoutBillingPage {
    private static final By BUTTON_FINISH = By.xpath("//button[@id='finish']");


    public ConfirmationPage clickFinishButton(){
        getDriver().findElement(BUTTON_FINISH).click();

        return new ConfirmationPage();
    }


}
