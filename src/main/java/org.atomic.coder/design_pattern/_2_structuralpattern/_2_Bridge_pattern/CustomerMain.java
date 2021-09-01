package org.atomic.coder.design_pattern._2_structuralpattern._2_Bridge_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 15:27
 */
public class CustomerMain {

    public static void main(String[] args) {

        // 大杯、5分糖
        ICoffeeSugar flavor = new FiveSugar();
        Coffee coffee = new LargeCupCoffee(flavor);
        coffee.makeCoffee();

        // 大杯、3粉汤
        new LargeCupCoffee(new ThreeSugar()).makeCoffee();

        // 小杯、5分糖
        new SmallCupCoffee(new FiveSugar()).makeCoffee();

        // 小杯、7分糖
        new SmallCupCoffee(new ThreeSugar()).makeCoffee();

    }

}
