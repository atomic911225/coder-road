package org.atomic.coder.design_pattern._2_structuralpattern._4_Decorator_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 16:54
 * <p>
 * 装饰器
 */
public abstract class Decorator implements Component {

    /**
     * 持有被装饰类，以公共接口接收
     */
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }



}
