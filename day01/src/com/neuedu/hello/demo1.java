package com.neuedu.hello;

import java.util.Arrays;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        int[] arry= new int[5];
        Random random =new Random();
        int sum=0;
        for (int i = 0; i <arry.length ; i++) {
            arry[i]=random.nextInt(100);
            System.out.print(arry[i]+"\t");
            sum=sum+arry[i];
        }
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        System.out.println("最大值是："+arry[4]);
        System.out.println("最小值是："+arry[0]);
        System.out.println("总和是"+sum);
        System.out.println("平均值是:"+sum/arry.length);
    }
}
