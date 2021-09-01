package org.atomic.coder.design_pattern._1_creationalpattern._2_factory_method_pattern.factory;

import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Bread;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Coffee;

/**
 * @author 80340897
 * @date 2021/8/19 16:31
 */
public abstract class AbstractFactory {

    public abstract Coffee createCoffee();

    public abstract Bread createBread();

}
