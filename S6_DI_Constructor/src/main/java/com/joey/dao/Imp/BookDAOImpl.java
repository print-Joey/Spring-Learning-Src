package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//生命周期的配置 方式二: 实现接口来完成
public class BookDAOImpl implements BookDAO {

    private int connectionNum;
    private String dataSource;

    public BookDAOImpl(int connectionNum, String dataSource) {
        this.connectionNum = connectionNum;
        this.dataSource = dataSource;
    }

    public void save() {
        System.out.println("BookDao save... \nVariable list:\n"+connectionNum+" "+dataSource);
    }


}
