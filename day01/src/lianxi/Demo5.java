package lianxi;

public class Demo5 {
    public static void main(String[] args) {
        int qian=1;
        int hou=1;
//        System.out.print(" "+qian+" "+hou);
       /* while (qian+hou<1000000000){
            qian =qian+hou;
            hou=qian-hou;*/
            for (int i = 0; i <38 ; i++) {
                qian =qian+hou;
                hou=qian-hou;

            }
        System.out.print(" "+qian);

            }


        }



