package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model2;

/**
 * @author 80340897
 * @date 2021/8/19 18:19
 *
 * 工作人员，负责搭配套餐的
 *
 */
public class KFCConcreteBuilder extends KFCBuilder{

    private ComboProduct comboProduct;

    public KFCConcreteBuilder() {
        comboProduct = new ComboProduct();
    }

    @Override
    KFCBuilder buildBread(String bread) {
        comboProduct.setBread(bread);
        return this;
    }

    @Override
    KFCBuilder buildDrink(String drink) {
        comboProduct.setDrink(drink);
        return this;
    }

    @Override
    KFCBuilder buildDessert(String dessert) {
        comboProduct.setDessert(dessert);
        return this;
    }

    @Override
    ComboProduct build() {
        return comboProduct;
    }

}
