package testcustomerfunc;

import Homedepot_pages.Home;
import authentication.MyAccount_Registration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends MyAccount_Registration {
    Home objHome;
    MyAccount_Registration objMyacc;

    @BeforeMethod
    public void intialization() {
        objHome = PageFactory.initElements(driver, Home.class);
        objMyacc = PageFactory.initElements(driver, MyAccount_Registration.class);
    }

    @Test(enabled = false)
    public void verifyRegistrationTest() throws InterruptedException {
        objHome.clickAccount();
        objHome.
                sleepFor(5);
        objMyacc.newAccountRegistration();
    }


}
