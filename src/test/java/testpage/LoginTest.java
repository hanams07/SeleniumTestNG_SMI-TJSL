package testpage;

import controller.pagecontroller.LoginController;
import jdk.jfr.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.BaseTest;

public class LoginTest extends BaseTest {

    private LoginController loginController;

    String username = "admin";
    String password = "admin";

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][] {
                {"", "","Failed : null username and password"},
                {username, "", "Failed : Password Empty"},
                {"hanams", "yagesya", "Failed : Unknown username" },
                {username, "yagesya", "Failed : Pass Incorrect"},
                {username, password, "Passed : Login Success"}
        };
    }


    @Test(priority = 1, dataProvider = "credentials")
    @Description("Login an Account")
    public void loginAccount(String username, String password, String expected){
        loginController = new LoginController(driver);
        loginController.clearUsername();
        loginController.fillUsername(username);
        loginController.fillPassword(password);
        loginController.loginBtn();
        loginController.loginAssertion(expected);
    }
}
