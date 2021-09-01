package org.atomic.coder.design_pattern._2_structuralpattern._1_Adapter_pattern._1_class_type;

/**
 * @author 80340897
 * @date 2021/8/27 10:36
 */
public class CustomerMain {

    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.sourceOperation();
        adapter.targetOperation();
    }

}
