package com.structure;

/**
 * Created by zhouzg on 2016/12/27.
 * 桥接模式
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化。这样一来两个
 * 维度之间就可以任意的扩展和变化而不影响对方。桥接模式极大的提高了系统的可扩展性，可以大大降低维护的成本。
 * 总结：接口——继承
 */
public class ExeciseBridge {
    public void run() {
        Brand brand = new Lenovo();
        Computer deskTop = new Desktop(brand);
        deskTop.sale();
    }
}

//品牌接口
interface Brand {
    void sale();
}

//具体品牌
class Lenovo implements Brand {

    public void sale() {
        System.out.println("联想电脑");
    }
}

//具体品牌
class Dell implements Brand {

    public void sale() {
        System.out.println("Dell电脑");
    }
}

//电脑类
class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void sale() {
        brand.sale();
    }
}

//不同类型的电脑
class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("这是台式电脑");
    }
}
//不同类型的电脑
class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("这是笔记本电脑");
    }
}


