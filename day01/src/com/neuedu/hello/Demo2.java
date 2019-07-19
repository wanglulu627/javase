package com.neuedu.hello;

public class Demo2 {
    public static void main(String[] args) {
        int [] arry={5,78,58,453,56};
        for (int i = 0; i <arry.length ; i++) {
            for (int j = 0; j < arry.length-1; j++) {
                if (arry[j]>arry[j+1]){
                    int tmp= arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=tmp;
                }
            }
        }
        for(int i:arry){
            System.out.println(i);
        }

    }

}
