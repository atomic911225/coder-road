package org.atomic.coder.design_pattern._3_behavioralpattern._3_Observer_Pattern;

import java.util.ArrayList;

/**
 * @author 80340897
 * @date 2021/8/26 17:17
 */
public abstract class Subject {

    protected ArrayList<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void delete(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知
     */
    public abstract void notifyObserver();


}
