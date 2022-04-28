/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singelton;
/**
 *
 * @author om patel
 */
public class Test {
    public static void main(String[] args) {
        Singleton si1=Singleton.getInstance();
        Singleton si2=Singleton.getInstance();
        si1.setInt(20);
        System.out.println("Value of a set by si1 is= "+si1.getInt());
        si2.setInt(30);
        System.out.println("Value of a set by si2 is= "+si2.getInt());
        System.out.println("Value if a is deference so si1 is now pointing to: "+si1.getInt());
        display("si1",si1);
        display("si2",si2);
    }
    static void display(String str,Singleton obj){
        System.out.println(String.format("Object: %s ,Hashcode: %d",str,obj.hashCode()));
    }
}
