package com.chuangjiangx.uart;

public class UartUtils {
    
    public static byte encrypt(int[] raws) {
        byte lrc = 0;
        for (int raw : raws) {
            lrc ^= int2byte(raw);
        }
        return lrc;
    }


    public static byte int2byte(int i) {
        return (byte) i;
    }
}
