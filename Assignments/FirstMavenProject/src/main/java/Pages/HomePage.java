package Pages;

import org.openqa.selenium.*;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.File;
import java.io.IOException;
//import sun.reflect.misc.FieldUtil;
//
//import java.io.File;
//import java.io.IOException;

public class HomePage {

    @FindBy(css = "div[class=\"alert alert-success\"]")
    private WebElement welcomeMessage;

    @FindBy(css = "a[href=\"/t/bags\"]")
    private WebElement categorySelection;

    public HomePage(WebDriver driver) {

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }

    public String spreeHome() {

        String messageActual = welcomeMessage.getText();
        return messageActual;

    }

    public void spreeHomeClick() {
        categorySelection.click();
    }


    public void screenShot(WebDriver driver, String fileWithPath) throws IOException {
        TakesScreenshot scrshot = ((TakesScreenshot) driver);
        File scrFile = scrshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File(fileWithPath);
        FileHandler.copy(scrFile, destFile);


    }
}
