package org.atomic.coder.design_pattern._3_behavioralpattern._4_State_Pattern;

/**
 * @author 80340897
 * @date 2021/8/26 18:10
 *
 * 不同环境下，水的状态是不一样的
 *
 */
public class WaterContext {

    private IWaterState waterState;

    public IWaterState getWaterState() {
        return waterState;
    }

    public void setWaterState(int type) {
        if(type == 0) {
            //冬天
            waterState = new IceWaterState();
            return;
        }

        if(type == 1) {
            //夏天
            waterState = new WarmWaterState();
            return;
        }

        if(type == 2) {
            // 锅中烧的
            waterState = new BoilingWaterState();
            return;
        }
    }

}
