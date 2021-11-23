package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class ProductDetailPage {

    @FindBy(id = "quantity")
    private WebElement quantity;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;


    public ProductDetailPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }

    public void selectItems() {

        quantity.clear();
        quantity.sendKeys("4");
        addToCart.click();

    }
}
