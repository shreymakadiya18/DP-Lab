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
public interface Subject {
    void subscribe(Subscriber sub);
    void unsubscribe(Observer sub);
    void notifySubscriber();
    void upload(String title);
}
