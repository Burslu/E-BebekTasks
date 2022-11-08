package PatikaCohorts;

public class PalindormSayi {
    static boolean isPalindrom(int number){
        int temp = number , reverseNumber = 0 , lastNumber;

        while (temp!=0){
            System.out.println("Number:" + number);

            lastNumber =temp % 10 ;
            System.out.println("Son Basamak:" +lastNumber);

            reverseNumber = (reverseNumber * 10)+lastNumber;
            System.out.println("Yeni sayi:" + reverseNumber);

            temp /= 10 ;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrom(389);
        //elde etmek istedigimiz 152 sayisi
        //7*10 = 70 + 4 = 74
        //74*10= 740 + 2 = 742
    }
}

