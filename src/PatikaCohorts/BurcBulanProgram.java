package PatikaCohorts;

import java.util.Scanner;

public class BurcBulanProgram {public static void main(String[] args) {

    int birthday,month;//dogum gunu ve takvim degiskenlerini tanimladik .
    Scanner scanner =new Scanner(System.in);
    System.out.println("please enter your month you were born:");
    month    = scanner.nextInt();
    System.out.println("please entor your birthday :");
    birthday = scanner.nextInt();

    switch (month){//switch case kullandik soruda istenildigi gibi
        case 1:
            if (birthday>=1 && birthday<=21) {
                System.out.println("your horoscope :Capricorn " + birthday);
            }else{
                System.out.println("you horoscope Aquarius" + birthday);
            }
            break;
        case 2:
            if (birthday>=1 && birthday<=19) {
                System.out.println("your horoscope Aquarius : " + birthday);
            }else{
                System.out.println("you horoscope Pisces:" + birthday);
            }
            break;
        case 3:
            if (birthday>=1 && birthday<=20) {
                System.out.println("your horoscope Pisces: " + birthday);
            }else{
                System.out.println("you horoscope Aries:" + birthday);
            }
            break;
        case 4:
            if (birthday>=1 && birthday<=20) {
                System.out.println("your horoscope Aries: " + birthday);
            }else{
                System.out.println("you horoscope Taurus:" + birthday);
            }
            break;
        case 5:
            if (birthday>=1 && birthday<=21) {
                System.out.println("your horoscope Taurus: " + birthday);
            }else{
                System.out.println("you horoscope Gemini:" + birthday);
            }
            break;
        case 6:
            if (birthday>=1 && birthday<=22) {
                System.out.println("your horoscope Gemini: " + birthday);
            }else{
                System.out.println("you horoscope Cancer:" + birthday);
            }
            break;
        case 7:
            if (birthday>=1 && birthday<=22) {
                System.out.println("your horoscope Cancer: " + birthday);
            }else{
                System.out.println("you horoscope Leo:" + birthday);
            }
            break;
        case 8:
            if (birthday>=1 && birthday<=22) {
                System.out.println("your horoscope Leo: " + birthday);
            }else{
                System.out.println("you horoscope Virgo:" + birthday);
            }
            break;
        case 9:
            if (birthday>=1 && birthday<=22) {
                System.out.println("your horoscope Virgo: " + birthday);
            }else{
                System.out.println("you horoscope Libra:" + birthday);
            }
            break;
        case 10:
            if (birthday>=1 && birthday<=22) {
                System.out.println("your horoscope Libra: " + birthday);
            }else{
                System.out.println("you horoscope Scorpio:" + birthday);
            }
            break;
        case 11:
            if (birthday>=1 && birthday<=21) {
                System.out.println("your horoscope Scorpio: " + birthday);
            }else{
                System.out.println("you horoscope Sagittarius:" + birthday);
            }
            break;
        case 12:
            if (birthday>=1 && birthday<=21) {
                System.out.println("your horoscope Sagittarius: " + birthday);
            }else{
                System.out.println("you horoscope Capricorn: " + birthday);
            }
            break;

    }


}
}
