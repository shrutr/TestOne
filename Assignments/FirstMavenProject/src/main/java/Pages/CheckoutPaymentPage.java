package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckoutPaymentPage {

    @FindBy(css = "h3[class=\"card-title mb-0 h5\"]")
    private WebElement paymentPage;

    @FindBy(id  = "order_payments_attributes__payment_method_id_3")
    private WebElement paymentMode;

    @FindBy(css ="input[value=\"Save and Continue\"]")
    private WebElement submit;


    public CheckoutPaymentPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);

    }

    public String paymentPage() {

        String info = paymentPage.getText();
        return info;

    }

    public void selectPaymentMode(){
        paymentMode.click();
        submit.click();

    }


}
