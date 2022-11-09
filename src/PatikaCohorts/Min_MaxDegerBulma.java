package PatikaCohorts;

import java.util.Scanner;

public class Min_MaxDegerBulma {
    public static void main(String[] args) {

        int counterNumb , min , max , number ;//minumumu degeri maximum degeri , sayi ve elaman sayici tanimlandi

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers are you going to enter:");
        counterNumb = scan.nextInt();
        int arr[] = new int[counterNumb];// dizi ile elaman sayici tanimlandi.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your numbers :");
            number = scan.nextInt();
            arr[i] = number;
        }

        max = arr[0];
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {//for ile yukarida yatinimladigimiz arr in lengthini donuyoruz.
            if (arr[i]>max){//elemanlari karsilastirma yapilir
                max = arr[i];//bir ust satirdaki isleme gore max deger arr in i inci elemanina esitlenir.
            }
            else if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max value :" + max);//maximim degeri yazdir/
        System.out.println("Min value :" + min);//minumum degeri yazdir.
    }
}
