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
public class Acer extends Device{
    private String ram;
    private String processor;
    private String gpu;
    private String storage;
    
    public Acer(String Ram,String Processor,String Gpu,String Storage){
        this.ram=Ram;
        this.processor=Processor;
        this.gpu=Gpu;
        this.storage=Storage;
    }
    public String getSpecs(){
        return "Acer laptop has "+this.ram+" of RAM \nProcessor: "+this.processor+" \nGpu: "+this.gpu+" \nand has "+this.storage+" of storage \n";
    }
    public String toString(){
        return "Acer("+"ram: "+ram+", Processor: "+processor+", Gpu: "+gpu+", Storage: "+storage+")";
    }
}
