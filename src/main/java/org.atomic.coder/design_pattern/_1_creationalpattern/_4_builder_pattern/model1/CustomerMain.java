package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model1;

/**
 * @author 80340897
 * @date 2021/8/19 18:11
 */
public class CustomerMain {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product.toString());
    }

}
