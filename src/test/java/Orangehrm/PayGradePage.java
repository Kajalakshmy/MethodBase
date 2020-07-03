package Orangehrm;

import controllers.MethodBase;
import controllers.PageBase;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class PayGradePage extends PageBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PayGradePage.class));


   // private static By Admin = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
   // private static By Job = By.xpath("//*[@id=\"menu_admin_Job\"]");
    //private  static By PayGrade = By.xpath("//*[@id=\"menu_admin_viewPayGrades\"]");
   // private  static By Add = By.xpath("//*[@id=\"btnAdd\"]");
   // private  static By name = By.xpath("//*[@id=\"payGrade_name\"]");
   // private  static By save = By.xpath("//*[@id=\"btnSave\"]");
   // private  static By cancel = By.xpath("//*[@id=\"btnCancel\"]");



    public static void clickAdmin() {
        MethodBase.click_ByXpath("clickAdmin");

    }

    public static void clickJob() {
        MethodBase.click_ByXpath("clickJob");

    }

    public static void clickPayGrade() {
        MethodBase.click_ByXpath("clickPayGrade");

    }

    public static void clickAdd() {
        MethodBase.click_ByXpath("clickAdd");

    }

    public static void setName(String Name) {
        MethodBase.setText_ByID("//*[@id=\"payGrade_name\"]","ds");

    }
    public static void Clicksave() {
        MethodBase.click_ByXpath("Clicksave");


    }

    public static void Clickcancel() {
        MethodBase.click_ByXpath("Clickcancel");


    }
}




