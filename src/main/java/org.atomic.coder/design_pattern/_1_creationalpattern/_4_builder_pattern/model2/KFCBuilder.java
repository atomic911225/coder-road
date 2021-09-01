package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model2;

/**
 * @author 80340897
 * @date 2021/8/19 18:14
 *
 * 套餐的规则
 *
 */
public abstract class KFCBuilder {

    /**
     *  汉堡
     * @param bread
     * @return
     */
    abstract KFCBuilder buildBread(String bread);

    /**
     * 饮料
     * @param drink
     * @return
     */
    abstract KFCBuilder buildDrink(String drink);

    /**
     * 甜品
     * @param dessert
     * @return
     */
    abstract KFCBuilder buildDessert(String dessert);

    /**
     * 获取套餐
     * @return
     */
    abstract ComboProduct build();

}
