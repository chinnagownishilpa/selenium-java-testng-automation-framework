package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private WebDriver driver;

    private By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By cart = By.className("shopping_cart_link");
    private By checkout = By.id("checkout");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By zip = By.id("postal-code");
    private By continueBtn = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutFlow() {
        driver.findElement(addToCart).click();
        driver.findElement(cart).click();
        driver.findElement(checkout).click();
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(zip).sendKeys("560001");
        driver.findElement(continueBtn).click();
    }
}
