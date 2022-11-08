package PatikaCohorts;

import java.util.Scanner;

public class ATMPojesi {
    public static void main(String[] args) {
      String username, passapord;
        int right = 3;
        int balance = 1200;
        int select,tutar;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz:");//kullaici adi girilen kisim
        username = scanner.nextLine();
        System.out.println("lutfen parolanizi giriniz:");//parola girigimiz adim
        passapord =scanner.nextLine();
     while (right > 0){
      if(username.equals("ooobeko123") || passapord.equals(123789465)){
          System.out.println("Merhaba Berkay bankasina hosgeldiniz "+username+"Bey");

          System.out.println("Yapmak istediginiz islem numarasini seciniz:");
          System.out.println(" 1 -para yatirma\n 2- para cekme\n 3-Bakiye sorugulama\n 4-cikis yapma");
          select =scanner.nextInt();
          switch (select){
              case 1:
                  System.out.println("yatirmak istediginiz tutari giriniz:");
                  tutar = scanner.nextInt();
                  balance += tutar;
                  System.out.println("para yatirma isleminiz gerceklesmistir bakiyeniz:"+balance);
                  break;
              case 2:
                  System.out.println("cekmek istediginiz tutari giriniz:");
                  tutar = scanner.nextInt();
                  //int price = scanner.nextInt();
                  if (tutar>balance){
                      System.out.println("Bakiyeniz yetersiz");
                  }else{
                  balance -=tutar;
                  System.out.println("para cekme isleminiz gerceklesmistir bakiyeniz:"+balance);
                  break;
                  }
              case 3:
                  System.out.println("Bakiyeniz:"+balance);
                  break;
              case 4:
                  System.out.println("cikis yapiliyor");
                  break;
          }
      } else {
            right--;
          System.out.println("Kullanici adi ve ya parolaniz yanlis lutfen tekrar deneyiniz");
          if (right==0){
              System.out.println("hesabiniz bloke olmustur luten banka ile gorusunuz");
          }else {
              System.out.println("Kalan deneme hakkiniz:" +right);
          }
      }
     }
    }
}
