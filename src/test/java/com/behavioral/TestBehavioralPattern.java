package com.behavioral;

import com.behavioral.strategy.ExerciseStrategy;

import org.junit.Test;

/**
 * Created by arron on 2016/12/17.
 */
public class TestBehavioralPattern {

    @Test
    public void testStrategy() {
        ExerciseStrategy exerciseStrategy = new ExerciseStrategy();
        exerciseStrategy.run();
    }

}
