package org.atomic.coder.design_pattern._1_creationalpattern._5_singleton_pattern._1_lazy_pattern;

/**
 * @author 80340897
 * @date 2021/8/20 17:04
 *
 * 懒汉模式
 * 线程不安全，延迟初始化，严格意义上不是单例模式
 *
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
