package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */


public class AppTest {

    private static final String URL = "https://www.saucedemo.com";
    private static final By LOGIN = By.xpath("//input[@id='user-name']");
    private static final By PASSWORD = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");
    private static final By ADD_FIRST_ITEM = By.xpath("//div[@class='inventory_item'][1]//button[text()='Add to cart']");
    private static final By SHOPPING_CART_LINK = By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']");
    private static final By BUTTON_CHECKOUT = By.xpath("//button[@id='checkout']");
    private static final By INPUT_FIRSTNAME = By.xpath("//input[@id='first-name']");
    private static final By INPUT_LASTNAME = By.xpath("//input[@id='last-name']");
    private static final By INPUT_ZIP = By.xpath("//input[@id='postal-code']");
    private static final By BUTTON_CONTINUE = By.xpath("//input[@id='continue']");
    private static final By BUTTON_FINISH = By.xpath("//button[@id='finish']");
    private static final By THANKS_TEXT = By.xpath("//h2[contains(text(),'THANK')]");

    //description = "autorization + checkout" tests
    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        //enter login
        WebElement login = driver.findElement(LOGIN);
        login.sendKeys("standard_user");
        //enter password
        WebElement password = driver.findElement(PASSWORD);
        password.sendKeys("secret_sauce");
        //click Login button
        WebElement button_login = driver.findElement(LOGIN_BUTTON);
        button_login.click();
        //add first item from the list
        WebElement firstItem = driver.findElement(ADD_FIRST_ITEM);
        firstItem.click();
        //open shopping cart
        WebElement shoppingCart = driver.findElement(SHOPPING_CART_LINK);
        shoppingCart.click();
        //go to Chekout
        WebElement buttonCheckout = driver.findElement(BUTTON_CHECKOUT);
        buttonCheckout.click();
        //fill firstname/lastname/zip
        WebElement firstnameCO = driver.findElement(INPUT_FIRSTNAME);
        firstnameCO.sendKeys("Igor");
        WebElement lastnameCO = driver.findElement(INPUT_LASTNAME);
        lastnameCO.sendKeys("Test");
        WebElement zipCO = driver.findElement(INPUT_ZIP);
        zipCO.sendKeys("12345");
        //click continue button
        WebElement buttonContinue = driver.findElement(BUTTON_CONTINUE);
        buttonContinue.click();
        //click finish button
        WebElement buttonFinish = driver.findElement(BUTTON_FINISH);
        buttonFinish.click();
        //Check if order has been placed
        WebElement msg = driver.findElement(THANKS_TEXT);
        Assert.assertEquals("Order hasn't placed", "THANK YOU FOR YOUR ORDER", msg.getText());
        driver.close();
    }
}
