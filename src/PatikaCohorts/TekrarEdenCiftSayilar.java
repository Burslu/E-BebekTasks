package PatikaCohorts;

import java.util.ArrayList;
import java.util.List;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 9, 7,85, 8, 11, 4, 6, 9, 3, 18, 70, 81, 12, 12, 12, 19};
        List<Integer> tekrarSay = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j])) {
                    if (numbers[j] % 2 == 0) {
                        if (!(tekrarSay.contains(numbers[j]))) {
                            tekrarSay.add(numbers[j]);
                        }
                    }
                }
            }
        }
        System.out.print("Tekrar eden sayilar: ");
        for (int TekSay : tekrarSay) {
            System.out.print(TekSay + " ");
        }
    }
}
