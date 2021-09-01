package org.atomic.coder.design_pattern._3_behavioralpattern._3_Observer_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 17:26
 */
public class CustomerMain {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver("观察者一号");
        Observer observer2 = new ConcreteObserverOther("观察者二号");

        subject.add(observer);
        subject.add(observer2);

        subject.notifyObserver();
    }

}
