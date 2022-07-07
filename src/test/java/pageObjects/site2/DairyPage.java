package pageObjects.site2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.getDriver;

public class DairyPage {

    private static final By TEXT_AREA = By.xpath("//textarea[@placeholder='Текст новой записи']");
    private static final By BUTTON_SAVE = By.xpath("//input[@id='btn_save']");
    private static final By SAVED_MSG2 = By.xpath("//div[contains(@id,'dit')]//div[@class = 'dt']");


    public DairyPage enterTextInTextArea() {
        getDriver().findElement(TEXT_AREA).sendKeys("Test text");
        return this;
    }

    public DairyPage clickSaveButton() {
        getDriver().findElement(BUTTON_SAVE).click();
        return this;
    }

    public DairyPage checkIfMessageSaved() {
        WebElement savedMsg = getDriver().findElement(SAVED_MSG2);
        Assert.assertEquals("Test", "Test text", savedMsg.getText());
        return this;
    }

}
