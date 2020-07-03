package Orangehrm;

import controllers.MethodBase;
import controllers.PageBase;
import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;


public class LoginPage extends PageBase {
  public SoftAssert softAssert;

  private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

 // private static By hdrLogin = By.id("logInPanelHeading");

  //private static By txtUserName = By.id("txtUsername");
  //private static By txtPassword = By.id("txtPassword");
  //private static By btnLogin = By.id("btnLogin");
  //private static By alert = By.id("spanMessage");


  public static void isLoginPageDisplay() {
  MethodBase.isDisplayed_ById("logInPanelHeading");
  }

  public static void setUserName() {
    MethodBase.setText_ByID("txtUsername","Admin");
  }

  public static void setPassword() {
    MethodBase.setText_ByID("txtPassword","admin123");

  }
  public static void clickLogin() {
    MethodBase.clickButton_ById("btnlogin");
  }

  // public static boolean isLoginAlertDisplay() {
  // MethodBase.isDisplayed_ById("spanMessage");

  public static void getLoginAlert() {
    MethodBase.isDisplayed_ById("spanMessage");
  }

}



