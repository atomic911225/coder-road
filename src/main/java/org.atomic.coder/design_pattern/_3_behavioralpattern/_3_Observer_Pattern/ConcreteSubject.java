package org.atomic.coder.design_pattern._3_behavioralpattern._3_Observer_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 17:18
 */
public class ConcreteSubject extends Subject {

    /**
     * 实现通知的方法
     */
    @Override
    public void notifyObserver() {
        System.out.println("目标对象状态已变化......发送通知给观察者中");

        for (Object object : list) {
            ((Observer) object).operation();
        }
    }

}