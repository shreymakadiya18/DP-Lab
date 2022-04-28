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
public class MyCarBuilder {
    private String manufacturer;
    private String engine;
    private String fueltype;
    private int mileage;
    private int price;
    public MyCarBuilder setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
        return this;
    }
    public MyCarBuilder setEngine(String engine){
        this.engine=engine;
        return this;
    }
    public MyCarBuilder setFueltype(String fueltype){
        this.fueltype=fueltype;
        return this;
    }
    public MyCarBuilder setMileage(int mileage){
        this.mileage=mileage;
        return this;
    }
    public MyCarBuilder setPrice(int price){
        this.price=price;
        return this;
    }
    public MyCar Car(){
        return new MyCar(manufacturer,engine,fueltype,mileage,price);
    }
}
