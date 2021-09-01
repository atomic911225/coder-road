package org.atomic.coder.design_pattern._2_structuralpattern._1_Adapter_pattern._1_class_type;

/**
 * @author 80340897
 * @date 2021/8/20 18:31
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 由于源类Adaptee没有方法 targetOperation()
     * 因此适配器补充上这个方法
     */
    @Override
    public void targetOperation() {
        System.out.println("这个是目标类处理方法");
    }

}
