package org.atomic.coder.design_pattern._2_structuralpattern._4_Decorator_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 17:41
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorA operation...");
    }
}
