package com.neuedu.hello;

import java.util.Scanner;

public class jitu1 {
    public static void main(String[] args) {
        System.out.println("请输入头的个数");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数");
        int foot = scanner.nextInt();
        int x=0;
        int y=0;
        if(foot>head&&foot>0&&head>0&&foot!=0){
            x=head-(foot-2*x) /4;
            y=head-x;
            System.out.println("兔子的个数是："+y);
            System.out.println("鸡的个数是："+x);

        }else{
            System.out.println("输入不合法");
        }

    }
}
