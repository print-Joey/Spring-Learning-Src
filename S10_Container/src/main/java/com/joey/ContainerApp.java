package com.joey;

import com.joey.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//https://cyborg2077.github.io/2022/08/29/Spring/

public class ContainerApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // 不常用 绝对路径找ApplicationContext.xml
        FileSystemXmlApplicationContext ctx1 = new FileSystemXmlApplicationContext("C:\\Code\\JavaProjects\\Spring\\S10_Container\\src\\main\\resources\\ApplicationContext.xml");
        ////获取bean的方式一: (强转)(按名称)
        //DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        //BookDAO bookDAO1 = (BookDAO) ctx.getBean("BookDao");

        ////获取bean的方式二: (指定类型)
        //DataSource dataSource1 =  ctx.getBean("dataSource",DataSource.class);
        //BookDAO bookDAO2 = ctx.getBean("BookDao",BookDAO.class);

        ////获取bean的方式三: (使用bean类型)(按类型)
        //DataSource dataSource2 =  ctx.getBean(DataSource.class);
        //BookDAO bookDAO3 = ctx.getBean(BookDAO.class);

        //lazy-init 属性示例
//        <!--    设置lazy-init=false后, ApplicationContext加载时,BookDAOImp的构造器会调用-->
//        <!--    设置lazy-init=true后, 只有ctx.getBean()执行后,BookDAOImp的构造器会调用-->
        BookDAO bookDAO4 = ctx.getBean(BookDAO.class);
    }
}
