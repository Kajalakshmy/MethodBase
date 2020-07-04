package tests;

import classpack.LoginPage;
import classpack.PayGradePage;
import com.google.gson.internal.$Gson$Preconditions;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.logging.Logger;


public class PayGradeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGradePage.class));
    @Test(priority = 1 )
    public void RoleTest( ){
        softAssert = new SoftAssert();
        PayGradePage.clickAdmin();
        PayGradePage.clickJob();
        PayGradePage.clickPayGrade();
        PayGradePage.clickAdd();
        PayGradePage.setName("name");
        PayGradePage.Clicksave();






    }
}
