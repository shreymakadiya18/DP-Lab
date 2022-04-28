/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import java.util.Scanner;
/**
 *
 * @author om patel
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 0 to buy laptop and 1 to buy mobile: ");
        int choice=sc.nextInt();
        if(choice==0){
            Device acer=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getItem(DeviceType.ACER);
            System.out.println(acer.getSpecs());
            Device msi=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getItem(DeviceType.MSI);
            System.out.println(msi.getSpecs());
        }
        else if(choice==1){
            Device samsung=FactoryGenerator.getFactory(FactoryType.MobileFactory).getItem(DeviceType.SAMSUNG);
            System.out.println(samsung.getSpecs());
            Device vivo=FactoryGenerator.getFactory(FactoryType.MobileFactory).getItem(DeviceType.VIVO);
            System.out.println(vivo.getSpecs());
        }
        else{
            System.out.println("Please enter a valid choice  0 for laptop and 1 for mobile.");
        }
    }
}
