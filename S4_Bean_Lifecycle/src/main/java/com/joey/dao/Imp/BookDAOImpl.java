package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//生命周期的配置 方式二: 实现接口来完成
public class BookDAOImpl implements BookDAO, InitializingBean, DisposableBean {

    public void save(){
        System.out.println("Book DAO save");
    }

    //方式一:配置xml
    // 在ApplicationContext.xml里设置 init-method="init" destroy-method="destroy1"
    // 生命周期方法 init destroy1

    public void init(){
        System.out.println("init");
    }
    public void destroy1()throws Exception {
        System.out.println("destroy1..");
    }

    //方式二:实现 InitializingBean, DisposableBean 两个接口
    // 生命周期方法 afterPropertiesSet destroy
    public void destroy()throws Exception {
        System.out.println("service destroy..");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
