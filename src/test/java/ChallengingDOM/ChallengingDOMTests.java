package ChallengingDOM;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ChallengingDOMPage;
import pages.HomePage;
import static org.testng.Assert.assertEquals;

public class ChallengingDOMTests extends BaseTests {

    private WebDriver driver;


    @Test
    public void testChallengingDOM(){
        ChallengingDOMPage challengingDOMPage = homePage.clickChallengingDomLink();
    }
}
