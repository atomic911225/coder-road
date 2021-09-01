package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model1;

/**
 * @author 80340897
 * @date 2021/8/19 18:02
 *
 * 加入有Builder指定，制造洋娃娃必须由：头部、身体、脚本组成
 *
 */
public abstract class Builder {

    /**
     * 制作头部
     */
    public abstract void createHeader();

    /**
     *  制作身体
     */
    public abstract void createBody();

    /**
     * 制作脚步
     */
    public abstract void createFoot();

    /**
     * 完工-获取产品
     * @return
     */
    abstract Product getProduct();

}
