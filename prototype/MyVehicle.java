/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author om patel
 */
public class MyVehicle implements Cloneable{
    private List<String> vlist;
    
    public MyVehicle(){
        this.vlist=new ArrayList<String>();
    }
    public MyVehicle(List<String> list){
        this.vlist=list;
    }
    public void insertData(){
        vlist.add("BMW");
        vlist.add("Honda City");
        vlist.add("Mustang GT");
        vlist.add("Tesla Model 3");
        vlist.add("KIA Seltos");
    }
    public void modify(){
        String s1=(String) this.vlist.get(0);
        System.out.println(s1);
    }
    public List<String> getVehicleList(){
        return this.vlist;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> l1=new ArrayList<String>();
        for(String s:this.vlist){
            l1.add(s);
        }
        return new MyVehicle(l1);
    }
}
