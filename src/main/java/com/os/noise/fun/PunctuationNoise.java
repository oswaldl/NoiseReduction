package com.os.noise.fun;

import com.os.noise.CheckNoise;

/**
 * Created by oswaldl on 3/2/16.
 */
public class PunctuationNoise extends NullNoise{

    public boolean isNoise(String text) {
        String str1 = text.replaceAll("[\\pP\\p{Punct}]", "");
        return super.isNoise(str1);
    }
}
