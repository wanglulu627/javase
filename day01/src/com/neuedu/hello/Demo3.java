package com.neuedu.hello;


import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        String s[][] = new String[2][3];

        s[0][0]=new String ("Good");
        s[0][1] = new String ("Luck");
        s[0][2] = new String ("");
        s[1][0] = new String ("to");
        s[1][1] = new String ("you");
        s[1][2] = new String ("!");
        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s.length+1 ; j++) {
                System.out.print(s[i][j] +" ");
            }

        }


    }

    }

