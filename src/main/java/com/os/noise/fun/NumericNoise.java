package com.os.noise.fun;

/**
 * Created by oswaldl(418336572@qq.com) on 3/2/16.
 */
public class NumericNoise extends NullNoise{

    public boolean isNoise(String text) {
        String str1 = text.replaceAll("[0-9]+", "");
        return super.isNoise(str1);
    }

}
