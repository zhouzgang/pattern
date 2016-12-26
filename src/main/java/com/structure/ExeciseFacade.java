package com.structure;

/**
 * Created by zhouzg on 2016/12/26.
 * <h3>外观模式</h3>
 *  外观模式提供了一个统一的接口，用来访问子系统中的一群接口
 *  让类和类之间尽量松耦合，类与类之间的依赖降到最低，各司其职
 */
public class ExeciseFacade {
    public void run() {
        new RegistFacade().regist();
    }

}

interface AIC {
    void checkName();
}

class SZAIC implements AIC {

    public void checkName() {
        System.out.println("检查名字是否冲突");
    }
}

interface TaxB {
    void taxCertificate();
}

class SZTaxB implements TaxB {

    public void taxCertificate() {
        System.out.println("办理税务登记");
    }
}

class RegistFacade {
    public void regist() {
        AIC aic = new SZAIC();
        aic.checkName();
        TaxB taxB = new SZTaxB();
        taxB.taxCertificate();
    }
}