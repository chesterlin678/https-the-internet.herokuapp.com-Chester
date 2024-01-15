package FormAuthentication;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FormAuthenticationPage;
import pages.SecurePage;


import static org.testng.Assert.assertTrue;

public class FormAuthenticationTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
    FormAuthenticationPage formAuthenticationPage = homePage.clickFormAuthentication();
    formAuthenticationPage.setUsername("tomsmith");
    formAuthenticationPage.setPasswordField("SuperSecretPassword!");
    SecurePage securePage = formAuthenticationPage.clickLogin();
    assertTrue(securePage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect!");
    }
}
