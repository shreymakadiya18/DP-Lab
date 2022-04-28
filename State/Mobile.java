/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;
/**
 *
 * @author om patel
 */
public class Mobile {
    public static void main(String[] args) {
        MobileContext mc=new MobileContext();
        mc.alert();
        mc.alert();
        mc.setState(new SlientState());
        mc.alert();
        mc.alert();
        mc.setState(new VibrateState());
        mc.alert();
        mc.alert();
        mc.setDefault();
    }
}
