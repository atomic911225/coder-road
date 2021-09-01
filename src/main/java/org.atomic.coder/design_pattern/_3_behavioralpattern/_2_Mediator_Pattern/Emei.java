package org.atomic.coder.design_pattern._3_behavioralpattern._2_Mediator_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:34
 */
public class Emei extends United {

    public Emei(Alliance alliance) {
        super(alliance);
    }

    @Override
    public void sendAlliance(String message) {
        alliance.notice(message, Emei.this);
    }

    public void getNotice(String message) {
        System.out.println("峨眉收到消息：" + message);
    }

}
