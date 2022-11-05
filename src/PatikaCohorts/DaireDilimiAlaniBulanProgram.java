package PatikaCohorts;

import java.util.Scanner;

public class DaireDilimiAlaniBulanProgram {
    public static void main(String[] args) {
        double pi = 3.14;
        double r,a;
        double alan ;

        Scanner sc = new Scanner(System.in);
        System.out.println("bir yari cap giriniz:");
        r =sc.nextDouble();
        System.out.println(" merkez acının olcusunu     ` giriniz");
        a = sc.nextDouble();

        alan = (pi*(r*r)*a)/360;
        System.out.println("daire dilimi alani"+alan);
    }
}
