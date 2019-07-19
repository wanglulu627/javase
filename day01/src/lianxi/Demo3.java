package lianxi;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个4位正整数：");
        int shu = input.nextInt();
        input.nextLine();
        if (shu > 999 && shu < 10000) {
            int qian = shu / 1000;
            int bai = shu % 1000 / 100;
            int shi = shu % 1000 % 100 / 10;
            int ge = shu % 1000 % 100 % 10;
            qian += 5;
            bai += 5;
            shi += 5;
            ge += 5;
            qian = qian % 10;
            bai = bai % 10;
            shi = shi % 10;
            ge = ge % 10;
            int tem = qian;
            qian = ge;
            ge = tem;
            tem = shi;
            shi = bai;
            bai = tem;
            int newshu = qian * 1000 + bai * 100 + shi * 10 + ge;
            System.out.println("加密后的数字为:" + newshu);

        } else {
            System.out.println("输入不正确");

        }


    }


}

