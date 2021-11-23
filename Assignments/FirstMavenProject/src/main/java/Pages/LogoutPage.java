package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogoutPage {
    @FindBy(css = "div[class=\"alert alert-notice\"]")
    private WebElement logoutMessage;


    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }


    public String logout() {

        String logoutMessage1 = logoutMessage.getText();
        return logoutMessage1;
    }

}