package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;


public class CheckoutAddressPage {

    @FindBy(name = "order[bill_address_attributes][firstname]")
    private WebElement firstName;

    @FindBy(name = "order[bill_address_attributes][lastname]")
    private WebElement lastName;

    @FindBy(name = "order[bill_address_attributes][address1]")
    private WebElement address1;

    @FindBy(name = "order[bill_address_attributes][address2]")
    private WebElement address2;

    @FindBy(name = "order[bill_address_attributes][city]")
    private WebElement city;

    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement state;

    @FindBy(name = "order[bill_address_attributes][zipcode]")
    private WebElement zipCode;

    @FindBy(name = "order[bill_address_attributes][country_id]")
    private WebElement country;

    @FindBy(name = "order[bill_address_attributes][phone]")
    private WebElement phone;

    @FindBy(css = "input[name=\"commit\"]")
    private WebElement submit;



    public CheckoutAddressPage(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2000), this);

    }


    public void addBillingAddress(String firstName1, String lastName2, String addr1, String addr2, String city1, String phone1) {

        firstName.sendKeys(firstName1);
        lastName.sendKeys(lastName2);
        address1.sendKeys(addr1);
        address2.sendKeys(addr2);
        city.sendKeys(city1);
        Select stateID = new Select(state);
        stateID.selectByValue("2864");
        zipCode.sendKeys("75217");
        Select countryID = new Select(country);
        countryID.selectByValue("233");

        phone.sendKeys(phone1);

    }

    public void saveAddr(){

       submit.click();

    }
}

