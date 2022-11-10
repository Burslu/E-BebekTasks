package PatikaCohorts.BoksOyunu;

public class Mach {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;


    public Mach(Fighter f1,Fighter f2,int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void runMach(){
        if (isCheck()){
            double firstHit =  Math.random();
            System.out.println(firstHit);
            while (this.f1.healty > 0 && this.f2.healty >0/*True seklinde de yazilabilirdi.*/){
            if (firstHit<=0.5){
                this.f1.healty = this.f2.hit(f1);
                if (isWin()){
                    break;
                }
                this.f2.healty = this.f1.hit(f2);
                if (isWin()){

                    break;
                }
            }
            System.out.println("========Yeni Round=========");
            this.f2.healty = this.f1.hit(this.f2);
            System.out.println(this.f2.healty);
            if (isWin()){
                break;
            }
            this.f1.healty = this.f2.hit(this.f1);
            if (isWin()){
                break;
            }
            System.out.println(this.f1.name+" Saglik:"+this.f1.healty);
            System.out.println(this.f2.name+" Saglik:"+this.f2.healty);
        }
        }else {
            System.out.println("Sporcularin kilolari istenilen deger araliginda degildir.");
        }
    }
boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >=minWeight && this.f2.weight <=maxWeight );
}
boolean isWin(){
        if (this.f1.healty == 0){
            System.out.println(f2.name + "KAZANDI!");
            return true;
        }
        if (this.f2.healty == 0){
            System.out.println(this.f1.name+"KAZANDI!");
            return true;
        }
        return false;
}
}
