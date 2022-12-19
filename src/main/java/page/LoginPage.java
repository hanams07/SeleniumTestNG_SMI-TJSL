package page;

import org.openqa.selenium.By;

public class LoginPage {

    protected By usernameField = By.id("username");
    protected By passField = By.id("password");
    protected By loginBtn = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/form/button");

    //Assert T

    public By getUsernameField() {
        return usernameField;
    }

    public By getPassField() {
        return passField;
    }

    public By getLoginBtn() {
        return loginBtn;
    }

    //Error Return

}
