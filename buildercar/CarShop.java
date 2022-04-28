/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercar;
/**
 *
 * @author om patel
 */
public class CarShop {
    public static void main(String[] args) {
        MyCarBuilder mcb=new MyCarBuilder();
        mcb.setEngine("V8");
        mcb.setFueltype("Diesel");
        mcb.setManufacturer("Ford Motor Company");
        mcb.setMileage(15);
        mcb.setPrice(2100000);
        MyCar mc=mcb.Car();
        System.out.println(mc);
    }
}
