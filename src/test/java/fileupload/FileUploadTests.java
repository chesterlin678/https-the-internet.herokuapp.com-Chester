package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("C:\\Users\\chest\\git\\the-internet-herokuapp\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getResultMessage(), "chromedriver.exe", "Incorrect file name or file");
    }
}
