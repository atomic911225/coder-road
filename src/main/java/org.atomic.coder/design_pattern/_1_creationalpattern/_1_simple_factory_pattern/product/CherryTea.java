package org.atomic.coder.design_pattern._1_creationalpattern._1_simple_factory_pattern.product;

/**
 * @author 80340897
 * @date 2021/8/19 11:41
 */
public class CherryTea extends Tea {

    @Override
    public void prepare() {
        System.out.println("我是樱桃茶");
    }

}
