package PatikaCohorts;

public class AsalSayiBulanProgram {
    public static void main(String[] args) {
        //Asal Sayi Bulan Program
        for (int i = 2; i < 100; i++) {//2 den baslayarak 100 e kadar devam eden bir dongu olusturduk.
            boolean flag = true;// bloean true degeri li boolean bir degisken tanimladik
            for (int j = 2; j <=i/2 ; j++) {//dondurdugumuz sayiyi 2 den baslayarak bolmeye basliyor kendinin yasinina kadar boler.
                if (i%j==0){// bolum sonucunda 0 veriyor ise isleme girer ve false ile karsilasarak asal olmadigini belirler.
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i + " ");
            }
        }
    }
}
