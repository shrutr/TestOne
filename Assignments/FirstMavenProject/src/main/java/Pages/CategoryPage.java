package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CategoryPage {

    @FindBy(css = "span[title=\"Ruby on Rails Tote\"]")
    private WebElement categorySelection;

    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);
    }

    public void selectCategory() {
        categorySelection.click();

    }
}

