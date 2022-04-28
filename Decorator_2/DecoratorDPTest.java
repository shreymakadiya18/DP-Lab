/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator_2;

/**
 *
 * @author om patel
 */
interface Dress {
    public void assemble();
}
class BasicDress implements Dress {
    @Override
    public void assemble() {
        System.out.println("Basic Dress Features Added.");
    }
}

class DressDecorator implements Dress {
    protected Dress dress;
    public DressDecorator(Dress d) {
        this.dress = d;
    }
    @Override
    public void assemble() {
        dress.assemble();
    }
}

class CasualDress extends DressDecorator {
    public CasualDress(Dress d) {
        super(d);
    }
    @Override
    public void assemble() {
    super.assemble();
        System.out.println("Casual Dress Features Added.");
    }
}

class SportsDress extends DressDecorator {
    public SportsDress(Dress d) {
        super(d);
    }
    @Override
    public void assemble() {
    super.assemble();
        System.out.println("Sports Dress Features Added.");
    }
}

class FancyDress extends DressDecorator {
    public FancyDress(Dress d) {
        super(d);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Fancy Dress Features Added.");
    }
}

class RedColourDress extends DressDecorator {
    public RedColourDress(Dress d) {
        super(d);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Red Colour to the Dress Added.");
    }
}

class GreenColourDress extends DressDecorator {
    public GreenColourDress(Dress d) {
        super(d);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Green Colour to the Dress Added.");
    }
}

public class DecoratorDPTest {
    public static void main(String[] args) {
        Dress sportsDress = new SportsDress(new BasicDress());
        sportsDress.assemble();
        System.out.println();
        
        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble();
        System.out.println();
        
        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
        System.out.println();
        
        Dress greenDress = new GreenColourDress(new BasicDress());
        greenDress.assemble();
        System.out.println();
        
        Dress sportsfancyDress = new SportsDress(new FancyDress(new BasicDress()));
        sportsfancyDress.assemble();
        System.out.println();
        
        Dress casualfancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualfancyDress.assemble();
        System.out.println();
        
        Dress redcasualDress = new RedColourDress(new CasualDress(new BasicDress()));
        redcasualDress.assemble();
        System.out.println();
        
        Dress redsportsfancyDress = new RedColourDress(new SportsDress(new FancyDress(new BasicDress())));
        redsportsfancyDress.assemble();
    }
}
