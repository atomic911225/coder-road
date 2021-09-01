package org.atomic.coder.design_pattern._3_behavioralpattern._4_State_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 18:09
 */
public class WarmWaterState implements IWaterState {

    @Override
    public void printState() {
        System.out.println("我是温水");
    }
}
