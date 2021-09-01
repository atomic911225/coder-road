package org.atomic.coder.design_pattern._2_structuralpattern._2_Bridge_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 15:15
 */
public class ThreeSugar implements ICoffeeSugar{

    @Override
    public String addSugar() {
        return "3分糖";
    }
}
