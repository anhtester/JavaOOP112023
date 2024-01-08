package TinhKeThua;

import common.BaseTest;

public class LoginTest extends BaseTest {

    public void testLoginSuccess(){
        createBrowser();
        System.out.println("Navigate to url http...");
        System.out.println("Set email valid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login button");
        System.out.println("Verify login success");
        closeBrowser();
    }

    public void testLoginWithEmailInvalid(){
        createBrowser();
        System.out.println("Navigate to url http...");
        System.out.println("Set email invalid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login button");
        System.out.println("Verify login fail");
        closeBrowser();
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.testLoginSuccess();
        loginTest.testLoginWithEmailInvalid();
    }

}
