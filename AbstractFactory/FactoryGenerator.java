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
public class FactoryGenerator {
    public static DeviceFactory getFactory(FactoryType factorytype){
        switch(factorytype){
            case LaptopFactory:return new LaptopFactory();
            case MobileFactory:return new MobileFactory();
        }
        return null;
    }
}
