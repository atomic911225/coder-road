package org.atomic.coder.design_pattern._1_creationalpattern._1_simple_factory_pattern;

import org.atomic.design._1_creationalpattern._1_simple_factory_pattern.factory.TeaFactory;
import org.atomic.design._1_creationalpattern._1_simple_factory_pattern.product.Tea;

/**
 * @author 80340897
 * @date 2021/8/19 11:55
 */
public class CustomerMain {

    public static void main(String[] args) {
        String type = "cherry";
        Tea tea = TeaFactory.createTea(type);
        tea.prepare();

        String type1 = "strawberry";
        Tea tea2 = TeaFactory.createTea(type1);
        tea2.prepare();
    }

}
