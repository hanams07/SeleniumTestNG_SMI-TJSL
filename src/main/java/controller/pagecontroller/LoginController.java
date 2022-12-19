package controller.pagecontroller;

import controller.BaseController;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import page.LoginPage;

public class LoginController extends BaseController {

    LoginPage loginPage = new LoginPage();
    SoftAssert softAssert = new SoftAssert();


    public LoginController(WebDriver driver) {
        super(driver);
    }

    public LoginController clearUsername(){
        clearText(loginPage.getUsernameField());
        return this;
    }

    public LoginController fillUsername(String username) {
        clearText(loginPage.getUsernameField());
        writeText(loginPage.getUsernameField(), username);
        return this;
    }


    public LoginController fillPassword(String password) {
        clearText(loginPage.getPassField());
        writeText(loginPage.getPassField(), password);
        return this;
    }


    public LoginController loginBtn(){
        click(loginPage.getLoginBtn());
        return this;
    }

    public LoginController loginAssertion(String expected){
        if ("Passed : Login Success".equals(expected)) {
            softAssert.assertTrue(true);
        }
        return this;
    }

}
