package org.atomic.coder.design_pattern._1_creationalpattern._5_singleton_pattern._3_double_check_lock_pattern;

/**
 * @author 80340897
 * @date 2021/8/20 17:10
 *
 * 双重锁模式：
 * 线程安全，延迟初始化。这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 *
 * 双重检查模式，进行了两次的判断，
 * 第一次是为了避免不要的实例，
 * 第二次是为了进行同步，避免多线程问题。
 *
 * 由于singleton=new Singleton()对象的创建在JVM中可能会进行重排序，在多线程访问下存在风险，使用volatile修饰signleton实例变量有效，解决该问题。
 *
 */
public class Singleton {

    /**
     * 1. 定义一个volatile的静态变量
     */
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        /**
         * 加锁，防止资源竞争
         */
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
