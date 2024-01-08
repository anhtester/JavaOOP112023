package TinhDaHinh;

import common.BaseTest;

public class DemoGhiDe extends BaseTest {

    public void createBrowser(){
        System.out.println("Run on Chrome browser");
        System.out.println("Config chặn notification");
        System.out.println("Config chặn save password");
        System.out.println("Config chạy chế độ headless");
    }

    public void createBrowser12345(){
        System.out.println("");
    }

    public void testAddUser(){
        createBrowser();
    }

    public static void main(String[] args) {
        DemoGhiDe demoGhiDe = new DemoGhiDe();
        demoGhiDe.testAddUser();
    }
}
