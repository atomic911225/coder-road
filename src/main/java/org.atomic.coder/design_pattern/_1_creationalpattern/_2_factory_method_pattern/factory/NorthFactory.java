package org.atomic.coder.design_pattern._1_creationalpattern._2_factory_method_pattern.factory;

import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Bread;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.CappuccinoCoffee;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Coffee;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.CreamBread;

/**
 * @author 80340897
 * @date 2021/8/19 16:41
 */
public class NorthFactory extends AbstractFactory {

    @Override
    public Coffee createCoffee() {
        return new CappuccinoCoffee();
    }

    @Override
    public Bread createBread() {
        return new CreamBread();
    }

}
