/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
/**
 *
 * @author om patel
 */
public class LaptopFactory  extends DeviceFactory{
    @Override
    Device getItem(DeviceType devicetype){
        switch(devicetype){
            case ACER: return new Acer("16gb","Intel i7-10700k","Nvidia gtx 2060","1Tb");
            case MSI: return new Msi("16gb","Ryzen 5 5900x","Nivdia gtx 2070","1Tb");
        }
        return null;
    }
    @Override
    public Device getItem(){
        return null;
    }
}
