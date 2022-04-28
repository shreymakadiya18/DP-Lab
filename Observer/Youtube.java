/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author om patel
 */
public class Youtube {
    public static void main(String[] args) {
        Channel Design = new Channel();

        Subscriber sub1 = new Subscriber("Raju");
        Subscriber sub2 = new Subscriber("Mohan");
        Subscriber sub3 = new Subscriber("Abdul");
        Subscriber sub4 = new Subscriber("Shyam");
        Subscriber sub5 = new Subscriber("Meet");

        Design.subscribe(sub1);
        Design.subscribe(sub2);
        Design.subscribe(sub3);
        Design.subscribe(sub4);
        Design.subscribe(sub5);

        sub1.subscribeChannel(Design);
        sub2.subscribeChannel(Design);
        sub3.subscribeChannel(Design);
        sub4.subscribeChannel(Design);
        sub5.subscribeChannel(Design);

        Design.upload("Design Pattern");
    }
    
}
