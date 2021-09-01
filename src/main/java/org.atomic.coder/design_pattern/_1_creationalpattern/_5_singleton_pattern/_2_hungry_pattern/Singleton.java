package org.atomic.coder.design_pattern._1_creationalpattern._5_singleton_pattern._2_hungry_pattern;

/**
 * @author 80340897
 * @date 2021/8/20 17:06
 *
 * 饿汉模式
 * 线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
 *
 */
public class Singleton {

    public static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

}
