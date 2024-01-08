package PhamViTruyCap.Common;

public class BaseTest {
    String browser = "chrome";

    protected String getBrowser(){
        return browser;
    }

    private String mode = "Headless";

    public void showInfo(){
        System.out.println(browser);
        System.out.println(mode);
    }
}
