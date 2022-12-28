package steps;

import io.cucumber.java.en.When;
import org.aspectj.weaver.ast.Test;
import util.CofigReader;
import util.TestBase;

import java.util.concurrent.TimeUnit;

public class TestSteps extends TestBase {

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       lp.enterUsername(CofigReader.getPropertyValue("usernamekey"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       lp.enterPassword(CofigReader.getPropertyValue("passwordkey"));
    }

    @When("I click on login button")
    public void i_click_on_login_button() throws InterruptedException {
       lp.clickOnLoginButton();
       Thread.sleep(5000);
    }

}
