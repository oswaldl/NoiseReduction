package com.os.noise.fun;

/**
 * Created by oswaldl(418336572@qq.com) on 3/2/16.
 */
public class RepeatNoise extends NullNoise {

    public boolean isNoise(String text){
        String repeatWord = text.substring(0,1);
        String str1 = text.replaceAll(repeatWord, "");
        return super.isNoise(str1);
    }
}
