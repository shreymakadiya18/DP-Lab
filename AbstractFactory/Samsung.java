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
public class Samsung extends Device{
    private String ram;
    private String processor;
    private String refreshrate;
    private String storage;
    
    public Samsung(String Ram,String Processor,String Refreshrate,String Storage){
        this.ram=Ram;
        this.processor=Processor;
        this.refreshrate=Refreshrate;
        this.storage=Storage;
    }
    public String getSpecs(){
        return "Samsung mobile has "+this.ram+" of RAM \nProcessor: "+this.processor+" \nScreen Refresh Rate: "+this.refreshrate+" \nand has "+this.storage+" of storage \n";
    }
    public String toString(){
        return "Samsung("+"ram: "+ram+", Processor: "+processor+", Screen Refreswh Rate: "+refreshrate+", Storage: "+storage+")";
    }
}
