package PatikaCohorts;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int base , exponent ;//taban ve ust degeleri degiskene atilip tanimlandi
        int total = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n value :");
        base = sc.nextInt();
        System.out.println("Enter your r value :");
        exponent = sc.nextInt();

        for (int i=1; i<=exponent; i++){// girilen ust degerini birer artirilarak geziliyor
            total *=base;

        }
        System.out.println(base+"^"+exponent+"="+total);
    }
}
