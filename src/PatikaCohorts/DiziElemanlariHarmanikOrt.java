package PatikaCohorts;

public class DiziElemanlariHarmanikOrt {
    public static void main(String[] args) {
        int arr [] = {1,5,32,7,54,7};
        double harAvarage ;
        double sum = 0 ;

        for (int i : arr){
            sum += (1/i);
        }

        harAvarage = arr.length / sum;
        System.out.println("Harmonik Ortlama :"+ harAvarage);
    }
}
