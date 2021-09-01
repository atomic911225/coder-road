package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._2_dynamic_proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:30
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("---------已经保存数据----------");
    }

}
