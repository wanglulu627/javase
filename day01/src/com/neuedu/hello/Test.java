package com.neuedu.hello;

/**
 *
 */
public class Test {
    public void putAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是:" +age);

    }

    public static void main(String[] args) {
        Test test = new Test();
       test.putAge();
    }
}
