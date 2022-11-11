package PatikaCohorts.MayinTarlasiOyunu;

import java.util.Arrays;
import java.util.Scanner;

public class MayinTarlasiOyunu {

    int row;
    int column;
    char [][] mineMap;
    char [][] gameMap;

// constuctor ile mineMap ve gameMape boyutunu ayarladik.
    public MayinTarlasiOyunu(int dimension ){
        this.row = dimension;
        this.column = dimension;
        mineMap = new char[row][column];
        for (int i = 0; i <mineMap[0].length ; i++) {
            Arrays.fill(mineMap[i],'-');
        }
        gameMap = new char[row][column];
        for (int i = 0; i <gameMap[0].length ; i++) {
            Arrays.fill(gameMap[i],'-');
        }
        generateMines();
    }

    public void generateMines(){
        int mineNumber = ((column*row)/4);
        for (int i=0; i<mineNumber; i++){
            int x = (int) (Math.random()*row);
            int y = (int) (Math.random()*column);

            if (mineMap[x][y]=='-'){
                mineMap[x][y] = '*';
            }else {
                i--;
            }
        }

    }
    public void printMineMap(){
        Arrays.stream(mineMap).forEach(x-> System.out.println(Arrays.toString(x)));
        System.out.println();
    }
    public void printGameMap(){
        System.out.println("**********************GAME BOARD********************");
        for (int i = 0; i <mineMap.length; i++) {
            for (int j = 0; j < mineMap[0].length; j++) {
                System.out.print(gameMap[j][i]+" ");
                }
            System.out.println();
            }
        System.out.println("********************************************************");
    }

    public void startGame(){

        while (!finishTest()){
            printGameMap();
            Scanner scan = new Scanner(System.in);
            System.out.print("ENTER YOUR X COORDINATE (HORIZONTAL): ");
            int xCor = scan.nextInt();
            System.out.print("ENTER YOUR Y COORDINATE (VERTICAL): ");
            int yCor = scan.nextInt();
            if (xCor > column || yCor > row){
                System.out.println("Please ENTER VALID COORDIRATE");
                continue;
            }
            if (mineMap[yCor][xCor] =='*'){//eger kullanicinin sectigi yerde mayin varsa kullanici hata yapti
                System.out.println("YOU LOST. GAME OVER");
                break;
            } else if (gameMap[yCor][xCor] != '-'){
                System.out.println("PLEASE SELECT AN UNSELECTED COORDINATE");
                continue;
            } else{
                //secilen kordinatin cevresinde ki mayin sayisini hesaplama kismi .
                //daha sonra hesaplanan sayiyi gameMapteki "-" nin yerine yazdir .
            int minesAround = calculateMinesAround(xCor , yCor);
                gameMap[yCor][xCor] = String.valueOf(minesAround).charAt(0);
                mineMap[yCor][xCor] = String.valueOf(minesAround).charAt(0);
            }
        }
    }

    public boolean finishTest(){
        for (int i = 0; i <mineMap.length; i++) {
            for (int j = 0; j < mineMap[0].length; j++) {
                if (mineMap[j][i] == '-'){
                    return false;
                }
            }
        }
        System.out.println("YOU WON CONGRATS !");
        return true;
    }
    private int calculateMinesAround(int x, int y) {
        int mineCount = 0 ;
        for (int i = x-1; i <x+2; i++) {
            for (int j = y-1; j <y+2; j++) {
                if (!(i<0 || i>=column|| j<0 || j>=row)){
                if (mineMap[j][i] == '*'){
                    mineCount++;
                }
                }
            }
        }
        return mineCount;
    }
}
