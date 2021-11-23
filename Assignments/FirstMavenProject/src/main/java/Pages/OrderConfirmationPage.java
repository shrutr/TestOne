package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OrderConfirmationPage {

  @FindBy(css ="div[class=\"alert alert-notice\"]" )
  private WebElement orderConfirm;

  @FindBy(css = "a[href=\"/logout\"]")
  private WebElement logout;

    public OrderConfirmationPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);

    }

    public String orderConfirm(){

        String confirm = orderConfirm.getText();
        return confirm;

    }

    public void logout(){
        logout.click();
    }
}
