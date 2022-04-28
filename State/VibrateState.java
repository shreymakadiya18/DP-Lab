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
public class VibrateState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("State set to VIBRATE!!!");
    }
}
