package org.atomic.coder.design_pattern._3_behavioralpattern._3_Observer_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 17:25
 */
public class ConcreteObserverOther implements Observer {

    private String observerName;

    public ConcreteObserverOther(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void operation() {
        System.out.println(observerName + "我要更新一下我的状态了......");
    }

}
