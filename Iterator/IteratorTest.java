/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author om patel
 */
public class IteratorTest {
    public static void main(String[] args) {
        Names name = new Names();

        for(Iterator it = name.getIterator(); it.hasNext();){
            String DesignPatternName = (String)it.next();
            System.out.println("Design Pattern : " + DesignPatternName);
        } 	
    }
}
