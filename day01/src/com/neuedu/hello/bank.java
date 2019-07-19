package com.neuedu.hello;

import java.util.Scanner;

public class bank {
    static int money= 10000;
   static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        showmenu();

    }
    static void showmenu(){
        while(true){
            System.out.println("**********");
            System.out.println("1.查看余额");
            System.out.println("2.取款");
            System.out.println("3.存钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入编号选择功能");
            int index=input.nextInt();
            input.nextLine();
            switch (index){
                case 1 :
                    lookmoney();
                    break;
                case 2 :
                    takemoney();
                    break;
                case 3 :
                    addmoney();
                    break;
                case 4 :
                    changemoney();
                    break;
                case 5 :
                    return;
                    default:
                        System.out.println("没有此项");
            }

        }

    }
    static void lookmoney(){
        System.out.println("余额为:"+money);
    }
    static void takemoney(){
        System.out.println("请输入取款金额");
        int take =input.nextInt();
        input.nextLine();
        if (take<money){
            money-=take;
            System.out.println("取款成功！");
        }else {
            System.out.println("余额不足");
        }
    }
    static void addmoney(){
        System.out.println("请输入存入金额");
        int add=input.nextInt();
        input.nextLine();
        money+=add;
        System.out.println("存款成功！");
    }
    static void changemoney(){
        System.out.println("请输入转账金额");
        int change =input.nextInt();
        input.nextLine();
        money-=change;
        System.out.println("转账成功！");

    }

}
