package PatikaCohorts;

public class MatrisTranspozu {
    public static void main(String[] args) {

        int [] [] arry = {// array tanimlandi.
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Matris:");
        for (int i = 0; i < 2; i++) {//matrisimizi  2 x 3 formatinda yazdirdik
            for (int j = 0; j < 3; j++) {
                System.out.print("["+arry[i][j]+"]");

            }
            System.out.println();
        }
        System.out.println("Transpozu : ");
        for (int i = 0; i < arry[0].length; i++) {//transpozumuz 3 x 2 formatina getirdi.
            for (int j = 0; j < arry.length; j++) {
                System.out.print(arry[j][i] + " ");// ici ile disinin eleman sayilarini yer degistirdim 2 x 3 ,3 x 2
            }
            System.out.println();

        }
    }

}
