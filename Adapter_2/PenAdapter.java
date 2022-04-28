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
public class PenAdapter implements Pen {
    TrimaxPen tp = new TrimaxPen();
    @Override
    public void write(String str) {
        tp.mark(str);
    }
}
