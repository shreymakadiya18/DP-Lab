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
public class MyPhone {
    private String company;
    private String processor;
    private String os;
    private int ram;
    private int camera;
    private int battery_capacity;
    private double screensize;
    
    public MyPhone(String company, String processor, String os, int ram, int camera, int battery_capacity, double screensize){
        this.company=company;
        this.processor=processor;
        this.os=os;
        this.ram=ram;
        this.camera=camera;
        this.battery_capacity=battery_capacity;
        this.screensize=screensize;
    }
    @Override
    public String toString(){
        return "My Phone[Comapny= "+company+", Processor= "+processor+", OS= "+os+", RAM= "+ram+", Camera= "+camera+"MP, Battery capacity= "+battery_capacity+"mAh, Screensize= "+screensize+"Inches]";
    }
}