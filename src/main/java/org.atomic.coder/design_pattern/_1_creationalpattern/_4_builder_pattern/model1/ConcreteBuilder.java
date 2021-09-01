package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model1;

/**
 * @author 80340897
 * @date 2021/8/19 18:04
 *
 * 具体的工人
 *
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void createHeader() {
        product.setHeader("紫色头发的头部");
    }

    @Override
    public void createBody() {
        product.setBody("修长的身体");
    }

    @Override
    public void createFoot() {
        product.setFoot("弓形足");
    }

    @Override
    Product getProduct() {
        return product;
    }

}
