package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {

    @FindBy(css = "a[href='/login'")
    private WebElement login;


    @FindBy(id="spree_user_email")
    private WebElement emailID;
    @FindBy(id="spree_user_password")
    private WebElement passwordText;
    @FindBy(css = "input[name='commit']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }



    public void spreeLogin(String userID, String password) {

        login.click();
        emailID.sendKeys(userID);
        passwordText.sendKeys(password);
        loginButton.submit();


    }

}
