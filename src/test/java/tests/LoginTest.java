package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelReader;

import java.io.IOException;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;
    BaseTest baseTest;

    @Test
    public void testLogin() throws IOException {
    String username = ExcelReader.getData("TestData", 1,1);
    String password = ExcelReader.getData("TestData", 1,2);

    loginPage.enterUserName(username);
    loginPage.enterPassword(password);
    loginPage.clickSubmitBtn();
    }
}
