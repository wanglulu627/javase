package com.neuedu.hello;
public class Shuixianhua {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i / 100;
            int y = i % 100 / 10;
            int z = i % 100 % 10;

            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.println("该数"+i+"是水仙花数");


            }
        }
    }
}
