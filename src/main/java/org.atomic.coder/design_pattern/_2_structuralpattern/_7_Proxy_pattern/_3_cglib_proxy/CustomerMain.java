package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._3_cglib_proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:41
 */
public class CustomerMain {

    public static void main(String[] args) {
        //目标对象
        UserDao userDao = new UserDao();
        //生成代理对象
        UserDao userDaoProxy = (UserDao) new CglibProxyFactory(userDao).getProxyInstance();
        //调用对象方法
        userDaoProxy.save();
    }

}
