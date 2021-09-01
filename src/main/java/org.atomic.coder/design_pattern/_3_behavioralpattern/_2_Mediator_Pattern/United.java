package org.atomic.coder.design_pattern._3_behavioralpattern._2_Mediator_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:31
 * <p>
 * 十大门派的
 */
public abstract class United {

    protected Alliance alliance;

    public United(Alliance alliance) {
        this.alliance = alliance;
    }

    /**
     * 发送消息
     * @param message
     */
    public abstract void sendAlliance(String message);

}
