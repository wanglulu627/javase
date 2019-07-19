package com.neuedu.hello;

public class Wenbonaqi {
    public static void main(String[] args) {
        int qian =1;
        int hou = 1;
       System.out.print(qian+" "+hou+" ");
      for(;qian+hou<1000;){
            qian=qian+hou;
            hou=qian-hou;
            System.out.print(qian+" ");
        }



        }
    }

