package com.neuedu.hello;
public class Lianxi {
    public static void main(String[] args) {
        //第一个
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }*/
        //第二种
        /*for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i+j>=4){
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/

        //第二个
        /*for (int i = 0; i < 5; i++) {
            for (int j =5;j>i; j--) {
            System.out.print("*");
        }

            System.out.println(" ");
        }*/

        //第三个
        /*for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }*/
        /*for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i+j>=4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //第四个
       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            for (int j = 5; j >i+1; j--) {
                System.out.print("*");
            }

            System.out.println(" ");

        }
*/
        //等边三角形
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i+j>=2&&j-i<=2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println(" ");

        }*/
        //菱形
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                if(i+j>=2&&j-i<=2&&i-j<=2&&i+j<=6){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }


            System.out.println(" ");

        }
*/
    }
}


