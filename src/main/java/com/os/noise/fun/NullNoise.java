package com.os.noise.fun;

import com.os.noise.CheckNoise;

/**
 * Created by oswaldl on 3/2/16.
 */
public class NullNoise implements CheckNoise {
    public boolean isNoise(String text) {
        return null == text || "".equals(text.trim());
    }
}
