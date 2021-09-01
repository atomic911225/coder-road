package org.atomic.coder.design_pattern._1_creationalpattern._5_singleton_pattern._5_enum_pattern;

/**
 * @author 80340897
 * @date 2021/8/20 17:41
 *
 * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例。实际上
 *
 *      枚举类隐藏了私有的构造器
 *      枚举类的域是相应类型的一个实例对象
 *      那么枚举类型日常用例是这样子的：
 *
 */
public enum Singleton {

    INSTANCE;

    //doSomething 该实例支持的行为

    /**
     * 可以省略此方法，通过Singleton.INSTANCE进行操作
     */
    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}
