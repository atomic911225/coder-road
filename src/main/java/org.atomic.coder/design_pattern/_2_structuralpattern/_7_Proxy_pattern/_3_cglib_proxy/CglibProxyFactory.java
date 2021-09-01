package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._3_cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 80340897
 * @date 2021/8/25 14:37
 */
public class CglibProxyFactory implements MethodInterceptor {

    /**
     * 维护目标对象
     */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取目标对象的代理对象
     */
    public Object getProxyInstance() {
        //1. 实例化工具类
        Enhancer en = new Enhancer();
        //2. 设置父类对象
        en.setSuperclass(this.target.getClass());
        //3. 设置回调函数
        en.setCallback(this);
        //4. 创建子类，也就是代理对象
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Begin Transaction");

        //执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        System.out.println("End Transaction");

        return returnValue;
    }

}
