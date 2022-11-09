package PatikaCohorts;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        /*
         *******************
          *****************
           ***************
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your step number");
        ucgenBastir(sc.nextInt());
    }
    public static void ucgenBastir(int number) {

        for (int i = 0; i <= number; i++) {//en dis dongu satir sayisi belirler
            for (int j = 0; j < i; j++) {//bosluklarimizi belirler.
                System.out.print(" ");
            }
            for (int t = (2 * (number - i)) - 1; t >= 1; t--) {// yildizlarin olustugu for dongumuz
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
