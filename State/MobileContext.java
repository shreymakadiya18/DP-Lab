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
public class MobileContext {
    private MobileAlertState currentState;
    private MobileAlertState defaultState;
    public MobileContext(){
        currentState=new RingingState();
    }
    public void setState(MobileAlertState state){
        System.out.println("--------State changed--------");
        currentState=state;
    }
    public void alert(){
        currentState.alert();
    }
    public void setDefault(){
        System.out.println("-----State changed to default-----");
        defaultState=new RingingState();
        defaultState.alert();
    }
}
