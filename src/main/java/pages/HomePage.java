package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public FormAuthenticationPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new FormAuthenticationPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversLink(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public AlertsPage clickAlertsLink(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ChallengingDOMPage clickChallengingDomLink(){
        clickLink("Challenging DOM");
        return new ChallengingDOMPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    }
