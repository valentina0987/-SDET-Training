package test;

import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class AuthorizationTest extends TestBase{


    @Test
    public void AuthorizationTest() {

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.passAuthorization();


        }
    }





