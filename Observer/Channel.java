/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author om patel
 */
public class Channel implements Subject{
    private List<Subscriber> subs = new ArrayList<Subscriber>();
    public String title;

    @Override
    public void subscribe(Subscriber sub)
    {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Observer sub)
    {
        subs.remove(sub);
    }

    @Override
    public  void notifySubscriber()
    {
        for(Observer sub:subs)
        {
            sub.update();
        }
    }

    @Override
    public  void  upload(String title)
    {
        this.title = title;
        notifySubscriber();
    }
}
