package org.atomic.coder.design_pattern._2_structuralpattern._1_Adapter_pattern._2_object_type;

/**
 * @author 80340897
 * @date 2021/8/20 18:35
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    @Override
    public void sourceOperation(){
        this.adaptee.sourceOperation();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    @Override
    public void targetOperation(){
        System.out.println("target operation...");
    }

}
