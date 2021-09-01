package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model2;

/**
 * @author 80340897
 * @date 2021/8/19 18:23
 */
public class CustomerMain {

    public static void main(String[] args) {
        KFCConcreteBuilder concreteBuilder = new KFCConcreteBuilder();
        ComboProduct comboProduct = concreteBuilder
                .buildBread("牛肉煲")
                .buildDrink("可乐")
                .buildDessert("冰淇淋")
                .build();
        System.out.println(comboProduct.toString());
    }

}
