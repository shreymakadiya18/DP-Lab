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
public class MyCar {
    private String manufacturer;
    private String engine;
    private String fueltype;
    private int mileage;
    private int price;
    public MyCar(String manufacturer, String engine, String fueltype, int mileage, int price){
        this.manufacturer=manufacturer;
        this.engine=engine;
        this.fueltype=fueltype;
        this.mileage=mileage;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Specification of car are: [Manufacturer= "+manufacturer+", Engine= "+engine+", Fuel Type= "+fueltype+", Mileage= "+mileage+"km/liter, Price= Rs"+price+"]";
    }
}
