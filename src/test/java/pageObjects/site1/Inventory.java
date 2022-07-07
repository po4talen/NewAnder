package pageObjects.site1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driverManager.DriverManager.*;


public class Inventory {
    private static final By ADD_FIRST_ITEM = By.xpath("//div[@class='inventory_item'][1]//button[text()='Add to cart']");
    private static final By SHOPPING_CART_LINK = By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']");


    public Inventory addFirstItem() {
        getDriver().findElement(ADD_FIRST_ITEM).click();
        return this;
    }

    public ShoppingCart goToShoppingCart() {
        getDriver().findElement(SHOPPING_CART_LINK).click();

        return new ShoppingCart();
    }
}

