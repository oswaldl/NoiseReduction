package com.os.test;

import com.os.noise.NoiseReduction;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class Test {

    @org.junit.Test
    public void testAll(){

        String text = "~!@#$%^&*(),.;[]";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "~!@#$%我^&*(),.;[]";
        assertFalse(NoiseReduction.getInstance().isNoise(text));

        text = "";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "         ";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "1234567890";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "2355我575757";
        assertFalse(NoiseReduction.getInstance().isNoise(text));

        text = "我我我我";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "aaaaaa";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "тарабарщина";
        assertTrue(NoiseReduction.getInstance().isNoise(text));

        text = "hello, i think the world is great!";
        assertTrue(NoiseReduction.getInstance().isNoise(text));


    }
}
