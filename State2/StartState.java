/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State2;
/**
 *
 * @author om patel
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Start State.");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start State";
    }
}
