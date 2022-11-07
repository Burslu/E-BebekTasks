package PatikaCohorts;

import java.util.Scanner;

public class CinZodyagiBurcu {
    public static void main(String[] args) {
        int birthday,calander;//takvim ve dogumyili girdileri icin degisken tanimlandi.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter your year of birth:");
        birthday = scanner.nextInt();
        calander = birthday%12; // yildaki takvim degeri aya bolunerek cin zodyagi burcu bulundu .
        switch (calander){//switch case ile takvim ve dogum yili degeleri elde edildi
            case 0:
                System.out.println("chinese zodiac sign Monkey : "+birthday);
                break;
            case 1:
                System.out.println("chinese zodiac sign Rooster "+birthday);
                break;
            case 2:
                System.out.println("chinese zodiac sign Dog "+birthday);
                break;
            case 3:
                System.out.println("chinese zodiac sign Pig "+birthday);
                break;
            case 4:
                System.out.println("chinese zodiac sign Mouse "+birthday);
                break;
            case 5:
                System.out.println("chinese zodiac sign Ox "+birthday);
                break;
            case 6:
                System.out.println("chinese zodiac sign Tiger"+birthday);
                break;
            case 7:
                System.out.println("chinese zodiac sign Rabbit "+birthday);
                break;
            case 8:
                System.out.println("chinese zodiac sign Dragon "+birthday);
                break;
            case 9:
                System.out.println("chinese zodiac sign Snake "+birthday);
                break;
            case 10:
                System.out.println("chinese zodiac sign Hourse "+birthday);
                break;
            case 11:
                System.out.println("chinese zodiac sign Sheep "+birthday);
                break;
        }
    }
}
