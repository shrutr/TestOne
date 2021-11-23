package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckoutDeliveryPage {

    @FindBy(css = "h3[class=\"card-title mb-0 h5\"]")
    private WebElement deliveryPage;

    @FindBy(css = "input[data-cost=\"$5.00\"")
    private WebElement checkShippingMethod;

    @FindBy(css = "input[name=\"commit\"]")
    private WebElement submit;


    public CheckoutDeliveryPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);

    }

    public String deliveryPageReview() {
       String deliveryPage1 =  deliveryPage.getText();
        return deliveryPage1;

    }

    public void deliveryPage(){

       checkShippingMethod.click();
       submit.click();
    }


}

