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
public class MyPhoneBuilder {
    private String company;
    private String processor;
    private String os;
    private int ram;
    private int camera;
    private int battery_capacity;
    private double screensize;
    public MyPhoneBuilder setCompany(String company){
        this.company=company;
        return this;
    }
    public MyPhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return this;
    }
    public MyPhoneBuilder setOS(String os){
        this.os=os;
        return this;
    }
    public MyPhoneBuilder setRAM(int ram){
        this.ram=ram;
        return this;
    }
    public MyPhoneBuilder setCamera(int camera){
        this.camera=camera;
        return this;
    }
    public MyPhoneBuilder setBattery(int battery_capacity){
        this.battery_capacity=battery_capacity;
        return this;
    }
    public MyPhoneBuilder setScreensize(double screensize){
        this.screensize=screensize;
        return this;
    }
    public MyPhone Phone(){
        return new MyPhone(company,processor,os,ram,camera,battery_capacity,screensize);
    }
}
