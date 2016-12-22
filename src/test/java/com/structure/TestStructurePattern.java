package com.structure;

import org.junit.Test;

/**
 * Created by zhouzg on 2016/12/22.
 */
public class TestStructurePattern {

    @Test
    public void testStaticProxy(){
        new ExeciseStaticProxy().execute();
    }

    @Test
    public void testDynamicProxy() {
        new ExeciseDynamicProxy().execute();
    }
}
