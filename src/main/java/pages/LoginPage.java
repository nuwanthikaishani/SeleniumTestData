package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement usernameFeild;

    @FindBy(id = "password")
    WebElement passwordFeild;

    @FindBy(id = "submit")
    WebElement loginBtn;

    public void LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterUserName(String username){
        usernameFeild.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordFeild.sendKeys(password);
    }

    public void clickSubmitBtn(){
        loginBtn.click();
    }
}
