package com.joey.dao.Imp;

import com.joey.dao.BookDAO;

//生命周期的配置 方式二: 实现接口来完成
public class BookDAOImpl implements BookDAO {

    private int connectionNum;

    public String getDataSource() {
        return dataSource;
    }


    private String dataSource;

    public int getConnectionNum() {
        return connectionNum;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }
    public void save() {
        System.out.println("BookDao save...");
    }

    public void setDataSource(String dataSource) {
    }
}
