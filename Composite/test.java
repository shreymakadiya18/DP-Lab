/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
/**
 *
 * @author om patel
 */
public class test {
    public static void main(String[] args) {
        Component ram=new Leaf("RAM",3000);
        Component storage=new Leaf("SSD",2000);
        Component processor=new Leaf("Processor",4000);
        Component gpu=new Leaf("GPU",6000);
        Component keyboard=new Leaf("Keyboard",4500);
        Component mouse=new Leaf("Mouse",320);
        Component monitor=new Leaf("Monitor",1200);
        
        Composite ac=new Composite("Accessories");
        Composite mb=new Composite("Motherboard");
        Composite cab=new Composite("Cabient");
        Composite computer=new Composite("Computer");
        
        mb.addComponent(processor);
        mb.addComponent(gpu);
        mb.addComponent(ram);
        
        cab.addComponent(mb);
        cab.addComponent(storage);
        
        ac.addComponent(mouse);
        ac.addComponent(keyboard);
        ac.addComponent(monitor);
        
        computer.addComponent(ac);
        computer.addComponent(cab);
        computer.displayPrice();
    }
}
