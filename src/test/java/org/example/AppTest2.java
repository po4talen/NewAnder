package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest2 {
    private static final String URL = "https://diary.anek.ws/";
    private static final By LOGIN = By.xpath("//input[@id='Nik']");
    private static final By PASSWORD = By.xpath("//input[@id='Password']");
    private static final By BUTTON_SUBMIT = By.xpath("//input[@id='login_subm']");
    private static final By TEXT_AREA = By.xpath("//textarea[@placeholder='Текст новой записи']");
    private static final By BUTTON_SAVE = By.xpath("//input[@id='btn_save']");
    private static final By SAVED_MSG2 = By.xpath("//div[contains(@id,'dit')]//div[@class = 'dt']");
    private static final By REGISTRAITION_URL = By.xpath("//div/a[@id='registr']");
    private static final By REG_LOGIN = By.xpath("//div[@id='main']//input[@name='Nik']");
    private static final By REG_PASSWORD = By.xpath("//div[@id='main']//input[@name='Password']");
    private static final By REG_EMAIL = By.xpath("//div[@id='main']//input[@name='Mail']");
    private static final By REG_SUBMIT = By.xpath("//div[@id='main']//input[@type='submit']");
    private static final By REG_Textarea = By.xpath("//textarea[@id='DiText']");



    @Test
    public void Login() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        //Login
        WebElement login = driver.findElement(LOGIN);
        login.sendKeys("vikwork23");
        WebElement password = driver.findElement(PASSWORD);
        password.sendKeys("dovUdmI7IU");
        WebElement buttonSubmit = driver.findElement(BUTTON_SUBMIT);
        buttonSubmit.click();
        WebElement textarea = driver.findElement(TEXT_AREA);
        textarea.sendKeys("Test text");
        WebElement buttonSave = driver.findElement(BUTTON_SAVE);
        buttonSave.click();
        WebElement savedMsg = driver.findElement(SAVED_MSG2);
        //check that entered text is posted
        Assert.assertEquals("Test", "Test text", savedMsg.getText() );
        driver.close();
    }

    @Test
    public void Registration(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        //Click registration
        WebElement regist = driver.findElement(REGISTRAITION_URL);
        regist.click();
        //Enter credentials
        WebElement reg_login = driver.findElement(REG_LOGIN);
        //Please use uniq value for firstname field
        reg_login.sendKeys("First233");
        WebElement reg_pass = driver.findElement(REG_PASSWORD);
        reg_pass.sendKeys("12345678");
        WebElement reg_email = driver.findElement(REG_EMAIL);
        reg_email.sendKeys("test@gmail.com");
        //CLick Submit
        WebElement submit = driver.findElement(REG_SUBMIT);
        submit.click();
        WebElement textarea = driver.findElement(TEXT_AREA);
        //Check if textarea is present
        Assert.assertTrue(textarea.isDisplayed());
    }
}
