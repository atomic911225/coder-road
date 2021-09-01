package org.atomic.coder.design_pattern._1_creationalpattern._4_builder_pattern.model1;

/**
 * @author 80340897
 * @date 2021/8/19 18:06
 */
public class Product {

    private String header;
    private String body;
    private String foot;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "header:" + header + ", body:" + body + ", foot:" + foot;
    }
}
