package PatikaCohorts;

import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smallNumber number:");
        int smallNumber = scanner.nextInt();

        System.out.println("Enter largesNumber number:");
        int largeNumber = scanner.nextInt();
        int t = 1;
        int ebob =1;
        int ekok =1;

        while (t<=smallNumber && t<=largeNumber){
            if (smallNumber % t == 0 && largeNumber % t == 0){
                ebob = t;
            }
            t++;
        }
        System.out.println("Ebob :" + ebob);

        while (t<=(largeNumber*smallNumber)){
            if (t % smallNumber == 0 && t % largeNumber ==0){
                ekok = t;
            }
        }
        System.out.println("Ekok"+ekok);


    }
}
