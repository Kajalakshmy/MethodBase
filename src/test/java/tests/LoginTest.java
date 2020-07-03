package tests;

import Orangehrm.LoginPage;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
   private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    @Test(priority = 0)
    public void LoginCorrect(){

        LoginPage.setUserName();
        LoginPage.setPassword();
        LoginPage.clickLogin();

      //  LoginPage.isLoginPageDisplay();
      //  LoginPage.getLoginAlert();
    }
    }
