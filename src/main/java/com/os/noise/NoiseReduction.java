package com.os.noise;

import com.os.noise.fun.*;

/**
 * user interface
 * Created by oswaldl on 3/2/16.
 */
public class NoiseReduction {

    private static NoiseReduction instance = null;
    private static CheckNoise punctuationNoise = null;
    private static CheckNoise numericNoise = null;
    private static CheckNoise repeatNoise = null;
    private static CheckNoise messyNoise = null;
    private static NullNoise nullNoise = null;

    public static NoiseReduction getInstance(){
        if(instance == null){
            synchronized (NoiseReduction.class){
                if(instance == null){
                    instance = new NoiseReduction();
                    punctuationNoise = new PunctuationNoise();
                    numericNoise = new NumericNoise();
                    repeatNoise = new RepeatNoise();
                    messyNoise = new MessyNoise();
                    nullNoise = new NullNoise();
                }
            }
        }
        return instance;
    }

    public boolean isNoise(String text){
        return nullNoise.isNoise(text)
                || punctuationNoise.isNoise(text)
                || numericNoise.isNoise(text)
                || repeatNoise.isNoise(text)
                || messyNoise.isNoise(text);
    }

}
