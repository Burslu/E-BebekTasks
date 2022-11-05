package PatikaCohorts;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String sysUsername, sysPassword;// kulllanici adi ve sifre
        sysUsername = "Berkay123";//kullanici adi dogru degerlere atandi.
        sysPassword = "Berkay321";//parola dogru degerlere atandi.
        int decision;//karar

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");//kullanici adi alindi
        String inputUsername = scan.nextLine();//kullanici adi alindi.

        System.out.println("Enter your password:");//parola alindi
        String inputPassword = scan.nextLine();//parola alindi.

        if (inputUsername.equals("Berkay123") && inputPassword.equals("Berkay321")) {//sifrenin dogru girilme durumu
            System.out.println("Welcome in site:" + inputUsername);
        } else {
            System.out.println("your password wrong,Would you like to reset the password?");
            System.out.println("select one of options\n1-yes\n2-no");
            decision = scan.nextInt();//karar degiskenine atandi.
            //Sifre hatali ve karar evet ise
            if (decision ==1) {
                String newPassword = scan.next();
                if (newPassword.equals(inputPassword) || newPassword.equals(sysPassword)) {
                    System.out.println("Your password cannot be the same as the old password.");// eski sifre yeni sifre ile ayni olmaz
                } else {
                    sysPassword = newPassword;
                    System.out.println("your new password is: "+sysPassword);//yeni sefre olusturuldu.
                }

            }
        }
       }
}
