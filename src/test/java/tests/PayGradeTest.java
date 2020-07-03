package tests;

import Orangehrm.PayGradePage;

import controllers.TestBase;
import org.testng.annotations.Test;


import java.util.logging.Logger;

public class PayGradeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGradePage.class));
    @Test(priority = 1 )

    public void RoleTest( String name){

        PayGradePage.clickAdmin();
        PayGradePage.clickJob();
        PayGradePage.clickPayGrade();
        PayGradePage.clickAdd();
        PayGradePage.setName(name);
        PayGradePage.Clicksave();


    }
}
