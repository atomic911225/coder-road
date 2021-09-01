package org.atomic.coder.design_pattern._2_structuralpattern._4_Decorator_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 16:53
 *
 * 被装饰类
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体实现类的操作");
    }

}
