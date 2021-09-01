package org.atomic.coder.design_pattern._2_structuralpattern._2_Bridge_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 15:26
 */
public class SmallCupCoffee extends Coffee{

    public SmallCupCoffee(ICoffeeSugar coffeeSugar) {
        super(coffeeSugar);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯咖啡：" + coffeeSugar.addSugar());
    }

}
