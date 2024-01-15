package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");

    private By resultText = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7));
    }

    public String getResult(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(resultText).getText();
    }

}
