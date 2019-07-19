package lianxi;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double PI=3.14;
        System.out.println("请输入该圆的半径");
        double radius=input.nextDouble();
        input.nextLine();
        double zhouchang=2*PI*radius;
        double mianji=PI*radius*radius;
        System.out.println("该圆的半径为："+radius);
        System.out.println("该圆的周长为："+zhouchang);
        System.out.println("该圆的面积为："+mianji);
    }

    }


