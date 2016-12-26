package com.structure;

import org.junit.Test;

/**
<<<<<<< HEAD
 * Created by arron on 2016/12/21.
=======
 * Created by zhouzg on 2016/12/22.
>>>>>>> bbe284b7a8a0bfd6a78ad7eeb1054d0d28bda750
 */
public class TestStructurePattern {

    @Test
    public void testAdaptor() {
        ExeciseAdaptor execiseAdaptor = new ExeciseAdaptor();
        execiseAdaptor.execute();
    }

    @Test
    public void testStaticProxy(){
        new ExeciseStaticProxy().execute();
    }

    @Test
    public void testDynamicProxy() {
        new ExeciseDynamicProxy().execute();
    }

    @Test
    public void testFacade() {
        new ExeciseFacade().run();
    }

}
