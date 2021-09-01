package org.atomic.coder.design_pattern._3_behavioralpattern._2_Mediator_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:34
 */
public class Shaolin extends United {

    public Shaolin(Alliance alliance) {
        super(alliance);
    }

    @Override
    public void sendAlliance(String message) {
        alliance.notice(message, Shaolin.this);
    }

    public void getNotice(String message) {
        System.out.println("少林收到消息：" + message);
    }

}
