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
public class MobileFactory extends DeviceFactory{
    Device getItem(DeviceType devicetype){
        switch(devicetype){
            case SAMSUNG: return new Samsung("8gb","Exynos 9611","120Hz","128gb");
            case VIVO: return new Vivo("6gb","Snapdragon 735g","90Hz","128gb");
        }
        return null;
    }
    @Override
    public Device getItem(){
        return null;
    }        
}
