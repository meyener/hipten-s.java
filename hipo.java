import java.util.Scanner;

public class hipo{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double a,b,c,d;
        System.out.println("lütfen birinci kenarı giriniz");
        a=scn.nextInt();
        System.out.println("lütfen ikinci kenarı giriniz");
        b=scn.nextInt();
        c=(a*a)+(b*b);
        c=Math.sqrt(c);
        System.out.println("hipotenüs"+c);
        
    }
}