/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.util.Scanner;
/**
 *
 * @author om patel
 */
public class MyOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter requirement(Open, Closed): ");
        String st = sc.nextLine();
        sc.close();
        OSFactory osf=new OSFactory();
        os o1=osf.getInstance(st);
        o1.spec();
        o1.mobileCompany();
        o1.currentVersion();
    }
}
