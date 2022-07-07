package pageObjects.site1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.getDriver;

public class ConfirmationPage {

    private static final By THANKS_TEXT = By.xpath("//h2[contains(text(),'THANK')]");

    public ConfirmationPage checkThatOrderIsPlaced(){
        WebElement msg = getDriver().findElement(THANKS_TEXT);
        Assert.assertEquals("Order hasn't placed", "THANK YOU FOR YOUR ORDER", msg.getText());
        return this;
    }
}
