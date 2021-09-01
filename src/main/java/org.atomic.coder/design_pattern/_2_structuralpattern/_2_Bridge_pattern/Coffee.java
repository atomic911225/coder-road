package org.atomic.coder.design_pattern._2_structuralpattern._2_Bridge_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 15:23
 */
public abstract class Coffee {

    protected ICoffeeSugar coffeeSugar;

    public Coffee(ICoffeeSugar coffeeSugar) {
        this.coffeeSugar = coffeeSugar;
    }

    /**
     * 获取咖啡
     */
    public abstract void makeCoffee();

}
