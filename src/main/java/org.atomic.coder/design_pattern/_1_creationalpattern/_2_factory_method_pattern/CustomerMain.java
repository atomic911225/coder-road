package org.atomic.coder.design_pattern._1_creationalpattern._2_factory_method_pattern;

import org.atomic.design._1_creationalpattern._2_factory_method_pattern.factory.AbstractFactory;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.factory.NorthFactory;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.factory.SouthFactory;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Bread;
import org.atomic.design._1_creationalpattern._2_factory_method_pattern.product.Coffee;

/**
 * @author 80340897
 * @date 2021/8/19 17:04
 */
public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("============================================================");

        // 小明去了 A 店
        AbstractFactory factory1 = new SouthFactory();
        Bread bread1 = factory1.createBread();
        bread1.eat();
        Coffee coffee1 = factory1.createCoffee();
        coffee1.drink();

        System.out.println("============================================================");

        // 小东去了 B 店
        AbstractFactory factory2 = new NorthFactory();
        Bread bread2 = factory2.createBread();
        bread2.eat();
        Coffee coffee2 = factory2.createCoffee();
        coffee2.drink();

        System.out.println("============================================================");

    }

}
