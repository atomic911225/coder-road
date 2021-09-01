package org.atomic.coder.design_pattern._2_structuralpattern._5_Facade_pattern;

/**
 * @author 80340897
 * @date 2021/8/23 18:03
 *
 * 门诊部
 */
public class OutpatientDepartment {

    /**
     * 挂号
     */
    public void getTicket() {
        System.out.println("第一步，先挂号");
    }

    /**
     * 缴费
     */
    public void pay() {
        System.out.println("第三步，缴费");
    }


}
