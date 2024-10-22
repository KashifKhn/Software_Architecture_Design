/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author FA22-BSE-068
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer ob1 = new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        subject.toggle(ob1, false);

        System.out.println("Second state change: 10");
        subject.setState(10);
        subject.deAttach(ob1);
        System.out.println("thrid state change: 10");
        subject.setState(10);
    }
}
