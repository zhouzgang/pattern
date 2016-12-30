package com.creative;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhouzg on 2016/12/23.
 * 原型模式
 * 拷贝对象
 */
public class ExecisePrototype {

    public static void shallowClone() throws Exception {

    }
}

class Prototype implements Cloneable, Serializable {
    private String name;
    private Date date;

    public Prototype() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws CloneNotSupportedException {
        Object obj = this.clone();
        Prototype p = (Prototype) obj;
        p.date = (Date)this.date.clone();
        return obj;
    }

}














