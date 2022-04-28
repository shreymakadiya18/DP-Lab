/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author om patel
 */
public class PhoneShop {
    public static void main(String[] args) {
        MyPhoneBuilder mpb=new MyPhoneBuilder();
        mpb.setRAM(8);
        mpb.setCompany("One Plus");
        mpb.setCamera(32);
        mpb.setOS("Android");
        mpb.setProcessor("Qualcomm");
        mpb.setScreensize(6.2);
        mpb.setBattery(5000);
        MyPhone mp=mpb.Phone();
        System.out.println(mp);
    }
}
