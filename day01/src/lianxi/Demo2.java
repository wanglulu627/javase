package lianxi;

public class Demo2 {
    public static void main(String[] args) {
        int money=10000;
        System.out.println("本金："+money);
        double livyear=(money+money*0.0035);
        double livtwoyear=(money+money*0.0035*2);
        double deadyear=(money+money*0.015);
        double deadtwoyear=(money+money*0.021*2);
        System.out.println("活期一年总金总计："+Math.round(livyear));
        System.out.println("定期一年总金总计："+Math.round(deadyear));
        System.out.println("活期两年总金总计："+Math.round(livtwoyear));
        System.out.println("定期两年总金总计："+Math.round(deadtwoyear));
    }

}
