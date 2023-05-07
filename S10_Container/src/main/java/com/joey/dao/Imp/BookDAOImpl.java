package com.joey.dao.Imp;

import com.joey.dao.BookDAO;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.*;

public class BookDAOImpl implements BookDAO {

    private int[] array_variableName;
    private List<String> list_variableName;
    private Set<String> set_variableName;
    private Map<String,String> map_variableName;
    private Properties properties_variableName;

    public BookDAOImpl() {
        System.out.println("BookDAOImpl constructor...");
    }

    public void save() {
        System.out.println("BookDao save..." );
        System.out.print("Array variables:");
        for (int i: array_variableName
             ) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.print("list variables:");
        for (String i: list_variableName
        ) {
            System.out.print(i+"\t");
        }

        System.out.println();
        System.out.print("set variables:");
        for (String i: set_variableName
        ) {
            System.out.print(i+"\t");
        }

        System.out.println();
        System.out.print("map variables:");
        // using iterators

        for (Map.Entry<String, String> entry : map_variableName.entrySet()) {
            System.out.print("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue() + "\t");
        }

        System.out.println();
        System.out.print("properties variables:");
        // Print new mapping using forEcah()
        properties_variableName.forEach((k, v) -> System.out.print("Key : " + k + ", Value : " + v + "\t"));

    }

    //setter   注入入口

    public void setArray_variableName(int[] array_variableName) {
        this.array_variableName = array_variableName;
    }

    public void setList_variableName(List<String> list_variableName) {
        this.list_variableName = list_variableName;
    }

    public void setSet_variableName(Set<String> set_variableName) {
        this.set_variableName = set_variableName;
    }

    public void setMap_variableName(Map<String, String> map_variableName) {
        this.map_variableName = map_variableName;
    }

    public void setProperties_variableName(Properties properties_variableName) {
        this.properties_variableName = properties_variableName;
    }
}
