/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;
import java.util.List;
/**
 *
 * @author om patel
 */
public class VehiclePrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyVehicle v1=new MyVehicle();
        v1.insertData();
        
        MyVehicle v2=(MyVehicle) v1.clone();
        List<String> list=v2.getVehicleList();
        list.add("McLeran F1 LM");
        System.out.println(v2.getVehicleList());
        
        v1.getVehicleList().remove("Honda City");
        System.out.println(list);
        System.out.println(v1.getVehicleList());
        v1.modify();
    }
}
