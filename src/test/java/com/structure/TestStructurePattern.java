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
}
