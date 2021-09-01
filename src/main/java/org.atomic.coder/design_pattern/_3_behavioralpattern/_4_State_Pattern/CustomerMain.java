package org.atomic.coder.design_pattern._3_behavioralpattern._4_State_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 18:13
 */
public class CustomerMain {

    public static void main(String[] args) {
        WaterContext waterContext = new WaterContext();

        waterContext.setWaterState(0);
        waterContext.getWaterState().printState();

        waterContext.setWaterState(1);
        waterContext.getWaterState().printState();

        waterContext.setWaterState(2);
        waterContext.getWaterState().printState();

    }

}
