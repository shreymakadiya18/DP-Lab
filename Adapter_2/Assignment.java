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
public class Assignment {
    private Pen p;
    public Pen getPen() {
        return p;
    }
    public void setPen(Pen p) {
        this.p=p;
    }
    public void writeAssignment(String str) {
        p.write(str);
    }
}
