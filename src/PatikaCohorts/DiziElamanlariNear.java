package PatikaCohorts;

import java.util.Scanner;

public class DiziElamanlariNear {
        public static void main(String[] args) {
            int[] numb = { 3,5,6,4,85,41,25,95,75,12 };
            int min, max, minValue, maxValue;
            int value;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your number:");
            value = scan.nextInt();
            min = numb[0];
            max = numb[0];
            for (int number : numb) {
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            }
            minValue = min;
            maxValue = max;
            for (int number : numb) {

                if (number > minValue && number < value) {
                    minValue = number;
                } else if (number < maxValue && number > value) {
                    maxValue = number;
                }

            }
            System.out.println("Girilen sayi en kucuk yakin: " + minValue);
            System.out.println("Girilen sayi en buyuk yakin: " + maxValue);
        }
    }
