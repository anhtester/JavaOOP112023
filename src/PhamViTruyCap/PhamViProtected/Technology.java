package PhamViTruyCap.PhamViProtected;

import PhamViTruyCap.Common.BaseTest;

public class Technology extends BaseTest{

    public void showInfo(){

        Computer computer = new Computer();
        System.out.println(computer.getComputerName());

        System.out.println(getBrowser());

    }

    public static void main(String[] args) {
        Technology technology = new Technology();
        technology.showInfo();
    }

}
