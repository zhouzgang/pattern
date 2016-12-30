package com.structure;

import org.junit.Test;

/**
 * Created by arron on 2016/12/21.
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

    @Test
    public void testBridge() {
        new ExeciseBridge().run();
    }

}
