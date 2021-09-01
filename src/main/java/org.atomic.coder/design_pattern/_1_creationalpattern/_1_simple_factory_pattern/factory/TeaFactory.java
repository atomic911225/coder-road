package org.atomic.coder.design_pattern._1_creationalpattern._1_simple_factory_pattern.factory;

import org.atomic.design._1_creationalpattern._1_simple_factory_pattern.product.CherryTea;
import org.atomic.design._1_creationalpattern._1_simple_factory_pattern.product.StrawberryTea;
import org.atomic.design._1_creationalpattern._1_simple_factory_pattern.product.Tea;

/**
 * @author 80340897
 * @date 2021/8/19 11:47
 *
 * 这个是简单工厂模式的核心类，业务逻辑都在这里
 *
 * 这个类崩溃了，就全部崩溃了，不符合 开闭原则：对扩展开放，对修改关闭
 *
 */
public class TeaFactory {

    public static Tea createTea(String type){
        Tea tea = null;
        if(type.equals("strawberry")){
            tea = new StrawberryTea();
        }else if(type.equals("cherry")){
            tea = new CherryTea();
        }
        return tea;
    }

}
