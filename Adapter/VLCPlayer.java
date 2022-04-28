/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author om patel
 */
public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file: "+ fileName);
    }
    @Override
    public void playMP4(String fileName) {
        
    }
}
