package com.os.noise.fun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by oswaldl(418336572@qq.com) on 3/2/16.
 */
public class MessyNoise extends NullNoise{

    public boolean isNoise(String text) {
        String regEx = "[\\u4e00-\\u9fa5]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);
        return !m.find();
    }

}
