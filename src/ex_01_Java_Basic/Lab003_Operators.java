package ex_01_Java_Basic;


public class Lab003_Operators {
    public static void main(String[] args) {
        int a = 300;
        int b = 600;
        System.out.println(a + b);
        //System.out.println(a / b);
        //System.out.println(a * b);
        //System.out.println(a == b);
        //System.out.println(a > b);
        //System.out.println(b > a);

        boolean x = false;
        boolean y = false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);

        a = 100;
        a++;
        System.out.println(a);

        b = 200;
        b--;
        System.out.println(b);
    }
}
