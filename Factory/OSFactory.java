/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
/**
 *
 * @author om patel
 */
public class OSFactory {
    public os getInstance(String str)
    {
        if(str.equalsIgnoreCase("Open"))
            return new android();
        else if(str.equalsIgnoreCase("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
