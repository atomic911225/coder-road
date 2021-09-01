package org.atomic.coder.design_pattern._1_creationalpattern._2_factory_method_pattern.factory;

import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Bread;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Coffee;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.MochaCoffee;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.OatsBread;

/**
 * @author 80340897
 * @date 2021/8/19 16:41
 */
public class SouthFactory extends AbstractFactory {

    @Override
    public Coffee createCoffee() {
        return new MochaCoffee();
    }

    @Override
    public Bread createBread() {
        return new OatsBread();
    }

}
