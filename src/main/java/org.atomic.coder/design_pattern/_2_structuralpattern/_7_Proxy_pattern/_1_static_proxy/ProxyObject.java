package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._1_static_proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:28
 *
 * 这种方案会需要新建很多代理类
 *
 */
public class ProxyObject extends AbstractObject {

    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        //在调用目标对象之前，完成一些操作
        System.out.println("Before Do Something");

        realObject.operation();

        //在调用目标对象之后，完成一些操作
        System.out.println("After Do Something");
    }

}
