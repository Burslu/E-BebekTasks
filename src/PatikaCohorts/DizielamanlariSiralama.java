package PatikaCohorts;

import java.util.Arrays;
import java.util.Scanner;

public class DizielamanlariSiralama {
    public static void main(String[] args) {
        int i ;// dizinin boyutu icin tanimladigimiz degisken.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Array length ; ");
        i = scan.nextInt();
         int arr []= new int[i];
        for (int j = 0; j < arr.length; j++) {//aldigimiz arr ye dizisini uzunlugu boyunca donguye soktuk
            System.out.println((j+1)+". Element: ");// her elemandan sonra j degiskenimi 1 arttirip sonra ki elemani girmesini istedik

            arr[j] = scan.nextInt();
        }
        Arrays.sort(arr);// arr siralama
        System.out.println("Sorted Array: "+ Arrays.toString(arr)); // arrayi siralama ve cikti alma asamammiz
    }
}
