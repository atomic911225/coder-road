package org.atomic.coder.design_pattern._2_structuralpattern._7_Proxy_pattern._2_dynamic_proxy;

/**
 * @author 80340897
 * @date 2021/8/25 14:32
 */
public class CustomerMain {

    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        System.out.println(userDao.getClass());

//        UserDao proxy = (UserDao) new ProxyFactory(userDao).getProxyInstance();// error
        IUserDao proxy = (IUserDao) new ProxyFactory(userDao).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }

}
