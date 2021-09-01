package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._1_static_proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:27
 */
public class RealObject extends AbstractObject {

    @Override
    public void operation() {
        System.out.println("Do Something!");
    }

}
