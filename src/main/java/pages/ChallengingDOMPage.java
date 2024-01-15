package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDOMPage {
    private WebDriver driver;
    public ChallengingDOMPage(WebDriver driver){
        this.driver = driver;
    }
    private By bluebutton = By.xpath("//div[@class=\"large-2 columns\"]/a[@class=\"button\"]");


    public void testBlueButton(){
        driver.findElement(bluebutton).click();

    }
    public String getResultMessage(){
        return driver.findElement(bluebutton).getText();
    }
}
