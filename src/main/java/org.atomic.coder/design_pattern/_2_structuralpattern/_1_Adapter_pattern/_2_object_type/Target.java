package org.atomic.coder.design_pattern._2_structuralpattern._1_Adapter_pattern._2_object_type;

/**
 * @author 80340897
 * @date 2021/8/20 18:33
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void sourceOperation();

    /**
     * 这是源类Adapteee没有的方法
     */
    void targetOperation();

}
