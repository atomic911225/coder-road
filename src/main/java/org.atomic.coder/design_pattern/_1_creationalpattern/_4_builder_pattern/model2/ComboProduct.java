package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model2;

/**
 * @author 80340897
 * @date 2021/8/19 18:15
 *
 * 具体的套餐
 *
 */
public class ComboProduct {

    private String bread = "肌肉汉堡";
    private String drink = "可乐";
    private String dessert = "冰淇淋";

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "bread:" + bread + ", drink:" + drink + ", dessert:" + dessert;
    }
}
