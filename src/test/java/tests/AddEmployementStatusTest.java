package tests;

import classpack.AddEmployementStatus;
import controllers.TestBase;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class AddEmployementStatusTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEmployementStatus.class));
    @Test(priority = 1 )
    public void RoleTest(){

        AddEmployementStatus.clickAdmin();
        AddEmployementStatus.clickJob();
        AddEmployementStatus.clickEmployementstatus();
        AddEmployementStatus.clickAdd();
        AddEmployementStatus.setName();
        AddEmployementStatus.clickbtnsave();



    }

}
