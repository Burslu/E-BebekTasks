package PatikaCohorts;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your step number:");// fibonacci serisinde ki adim sayisi istenir
        int number = sc.nextInt();

        int number1 = 0 , number2 = 1 , number3;// 3 farkli sayi degiskeni tanimlanir number1 = 0 a number2=1 e atanir 0+1 , 1+1 seklinde kullanacagiz.
        for (int i = 2; i < number; i++) {
            number3 = number1 + number2;//fib serisi seklinde toplama isleme yapilarak isleme devam edilir
            System.out.print(number1+"+"+number2+ "= ");// toplama islemi yazdirilir
            number1 = number2;
            number2 = number3 ;
            System.out.println(number3+" ");
            //fibonacci serisi ornek ciktisi:
            //Enter your step number:
            //9
            //0+1=1
            //1+1=2
            //1+2=3
            //2+3=5
            //3+5=8
            //5+8=13
            //8+13=21
        }
    }
}
