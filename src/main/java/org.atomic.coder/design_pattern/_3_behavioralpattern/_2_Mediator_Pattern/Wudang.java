package org.atomic.coder.design_pattern._3_behavioralpattern._2_Mediator_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:32
 */
public class Wudang extends United {

    public Wudang(Alliance alliance) {
        super(alliance);
    }

    @Override
    public void sendAlliance(String message) {
        alliance.notice(message, this);
    }

    public void getNotice(String message) {
        System.out.println("武当收到消息：" + message);
    }
}
