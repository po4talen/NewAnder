package pageObjects.site1;

import org.openqa.selenium.By;
import static driverManager.DriverManager.*;
public class ShoppingCart {

    private static final By BUTTON_CHECKOUT = By.xpath("//button[@id='checkout']");


    public CheckoutYourInfo clickCheckoutButton(){
        getDriver().findElement(BUTTON_CHECKOUT).click();
        return new CheckoutYourInfo();
    }
}
