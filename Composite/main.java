/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import java.util.ArrayList;
/**
 *
 * @author om patel
 */
interface Component{
    void displayPrice();
    int returnPrice();
}
class Leaf implements Component{
    String name;
    int price;
    public Leaf(String name,int price){
        this.name=name;
        this.price=price;
    }
    @Override
    public void displayPrice(){
        System.out.println("Leaf->Name: "+name+", Price: "+price);
    }
    @Override
    public int returnPrice(){
        return this.price;
    }
}
class Composite implements Component{
    String name;
    ArrayList<Component>com=new ArrayList<Component>();
    public Composite(String name){
        this.name=name;
    }
    public void addComponent(Component c){
        com.add(c);
    }
    @Override
    public int returnPrice(){
        int total=0;
        for(Component c:com){
            total+=c.returnPrice();
        }
        return total;
    }
    @Override
    public void displayPrice(){
        System.out.println("Composite->Name: "+name+", Price: "+returnPrice());
        for(Component c:com){
            c.displayPrice();
        }
    }
}

