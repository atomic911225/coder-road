package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 18:30
 *
 * 抽象享元角色
 */
public interface Flyweight {

    public void operation(UnsharedConcreteFlyweight state);

}
