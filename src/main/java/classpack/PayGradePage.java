package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class PayGradePage extends PageBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PayGradePage.class));



    public static void clickAdmin() {
        MethodBase.click_ByXpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");

    }

    public static void clickJob() {
        MethodBase.click_ByXpath("//*[@id=\"menu_admin_Job\"]");

    }

    public static void clickPayGrade() {
        MethodBase.click_ByXpath("//*[@id=\"menu_admin_viewPayGrades\"]");

    }

    public static void clickAdd() {
        MethodBase.click_ByXpath("//*[@id=\"btnAdd\"]");

    }

    public static void setName(String Name) {
        MethodBase.setText_ByID("payGrade_name","ds");

    }
    public static void Clicksave() {
        MethodBase.click_ByXpath("//*[@id=\"btnSave\"]");


    }

    public  static  void clickedit(){
        MethodBase.clear_ByXpath("//*[@id=\"btnSave\"]");
    }

    public static void Clickcancel() {
        MethodBase.click_ByXpath("//*[@id=\"btnCancel\"]");


    }
}




