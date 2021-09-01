package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 18:37
 */
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
