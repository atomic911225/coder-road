package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model1;

/**
 * @author 80340897
 * @date 2021/8/19 18:08
 */
public class Director {

    /**
     * 指挥工人按顺序造房
     */
    public Product create(Builder builder) {
        builder.createHeader();
        builder.createBody();
        builder.createFoot();
        return builder.getProduct();
    }

}
