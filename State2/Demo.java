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
public class Demo {
    public static void main(String[] args) {
        Context context=new Context();
        StartState startState=new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        
        StopState stoptState=new StopState();
        stoptState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
