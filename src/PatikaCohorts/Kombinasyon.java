package PatikaCohorts;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!) kombinasyon formulu . 
        int n , r ;// n ve r degiskenleri kombinasyon icin kullanim icin tanimlandi .
        int combination;
        int komN=1 , komR=1 , komNR=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n value :");
        n = sc.nextInt();
        System.out.println("Enter your r value :");
        r = sc.nextInt();
        for (int i = 1; i < n; i++) {
            komN *=i;
        }
        for (int j = 1; j < r; j++) {
            komR *=j;
        }
        for (int t = 1; t < (n-r); t++) {
            komNR *=t;
        }
        combination = komN / (komR * komNR);
        System.out.println("combination :" + combination);
    }
}
