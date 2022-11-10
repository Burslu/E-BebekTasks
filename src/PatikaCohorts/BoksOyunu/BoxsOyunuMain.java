package PatikaCohorts.BoksOyunu;

public class BoxsOyunuMain {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("berkay",10,70,85,0);
    Fighter f2 = new Fighter("ibrahim",11,80,95,0);


    Mach mach = new Mach(f1,f2,84,95);
    mach.runMach();
    }
}
