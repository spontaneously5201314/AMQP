package com.cmcm.study.rabbitmq.javap;

/**
 * @author Spontaneously
 * @date 2018/11/17 17:25
 **/
public class Hello {

    private static int k = 0;
    private Object obj = new Object();
    private int s = 0;

    private int devide(int a, int b) {
        int c = 2;
        int sum = a + b;
        int devide = sum / c;
        return devide;
    }

    public void methodTwo(int i) {
        int j = 0;
        int sum = i + j;
        Object acb = obj;
        long start = System.currentTimeMillis();
        devide(sum, i);
    }
}
