package org.atomic.coder.design_pattern._2_structuralpattern._4_Decorator_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 17:43
 */
public class CustomerTest {

    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.operation();

        Component component = new ConcreteDecoratorA(new ConcreteComponent());
        component.operation();
        Component component2 = new ConcreteDecoratorB(new ConcreteComponent());
        component2.operation();
    }

}
