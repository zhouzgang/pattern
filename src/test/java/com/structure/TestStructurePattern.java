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
<<<<<<< HEAD
    public void testAdaptor() {
        ExeciseAdaptor execiseAdaptor = new ExeciseAdaptor();
        execiseAdaptor.execute();
=======
    public void testStaticProxy(){
        new ExeciseStaticProxy().execute();
    }

    @Test
    public void testDynamicProxy() {
        new ExeciseDynamicProxy().execute();
>>>>>>> bbe284b7a8a0bfd6a78ad7eeb1054d0d28bda750
    }
}
