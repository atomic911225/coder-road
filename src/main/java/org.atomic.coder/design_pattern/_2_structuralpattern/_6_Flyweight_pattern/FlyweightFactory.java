package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern;

import java.util.HashMap;

/**
 * @author 80340897
 * @date 2021/8/23 18:32
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap(8);

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

}
