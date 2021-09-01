package org.atomic.coder.design_pattern._1_creationalpattern._5_singleton_pattern._4_inner_class_pattern;

/**
 * @author 80340897
 * @date 2021/8/20 17:28
 */
public class Singleton {

    /**
     * 私有构造方法
     */
    private Singleton() {}

    /**
     * 静态内部类，持有 静态、实例变量
     */
    private static class HolderSingleton {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderSingleton.instance;
    }

}
