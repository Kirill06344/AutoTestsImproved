package ok_tests;

import core.BaseSeleniumTest;
import org.junit.Test;
import pages.LoginPage;

public class LoginFromOkTest extends BaseSeleniumTest {

    @Test
    public void checkPageEntry()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
