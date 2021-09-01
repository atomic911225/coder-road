package org.atomic.coder.design_pattern._2_structuralpattern._2_Bridge_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 15:24
 */
public class LargeCupCoffee extends Coffee {

    public LargeCupCoffee(ICoffeeSugar coffeeSugar) {
        super(coffeeSugar);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯咖啡: " + this.coffeeSugar.addSugar());
    }

}
