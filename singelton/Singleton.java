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
public class Singleton {
    private static Singleton object=new Singleton();
    public int a;
    private Singleton(){
        System.out.println("Created ");
    }
    public static Singleton getInstance(){
        return object;
    }
    public int getInt(){
        return a;
    }
    public static void setObj(Singleton obj1){
        Singleton.object=obj1;
    }
    public void setInt(int a1){
        this.a=a1;
    }
}
