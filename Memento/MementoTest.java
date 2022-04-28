/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author om patel
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator orig = new Originator();
        CareTaker ct = new CareTaker();

        orig.setState("State #1");
        orig.setState("State #2");
         ct.add(orig.saveStateToMemento());

         orig.setState("State #3");
         ct.add(orig.saveStateToMemento());

         orig.setState("State #4");
         System.out.println("Current State: " + orig.getState());		

         orig.getStateFromMemento(ct.get(0));
         System.out.println("First saved State: " + orig.getState());
         orig.getStateFromMemento(ct.get(1));
         System.out.println("Second saved State: " + orig.getState());
      }
}
