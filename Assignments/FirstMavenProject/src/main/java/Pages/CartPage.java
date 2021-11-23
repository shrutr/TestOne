package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartPage {

    @FindBy(css = "td[class='lead']")
    private WebElement cartTotal;

    @FindBy(id = "checkout-link")
    private WebElement checkout;

    public CartPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }


    public String cartTotal() {

        String cartTotal1 = cartTotal.getText();
        return cartTotal1;

    }

    public void cartSubmit() {
        checkout.click();
    }

}
