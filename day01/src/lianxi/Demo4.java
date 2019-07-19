package lianxi;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个十进制数");
        int x=input.nextInt();
        input.nextLine();
        toBinary(x);

    }

    static void toBinary(int x) {
        String binary = "";
        while (x >= 1) {
            if (x % 2 == 0) {
                binary += "0";
                x = x / 2;
            } else {
                binary += "1";
                x = x / 2;
            }

        }
        if (binary.length() != 0) {
            char[] arr = binary.toCharArray();
            for (int i = binary.length() - 1; i >= 0; i--) {
                System.out.print(arr[i]);

            }
        }

    }
}
