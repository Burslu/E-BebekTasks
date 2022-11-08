package PatikaCohorts;

import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        /*
                  *
                 * *
                * * *
               * * * *
              * * * * *
               * * * *
                * * *
                 * *
                  *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your step number");
        int number;      // basamak sayimizi tanimladik.
        number = sc.nextInt();


        for (int i = 1; i < number; i++) {//en dis dongu satir sayisi belirler
            for (int j = number; j >i; j--) {//bosluk kismi
                System.out.print(" ");
            }
            for (int y = 1; y <=i; y++) {//yildiz kismi
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=number; i++ ){//en dis dongu satir sayisi belirler
            for (int j=1; j<=i; j++){//bosluk kismi
                System.out.print(" ");
            }
            for (int y =number; y>i; y--){//yildiz kismi
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/

