/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter_2;

/**
 *
 * @author om patel
 */
public class School {
    public static void main(String[] args){
        Pen p=new PenAdapter();
        Assignment assign=new Assignment();
        assign.setPen(p);
        assign.writeAssignment("Writting a new assignment.");
    }
}
