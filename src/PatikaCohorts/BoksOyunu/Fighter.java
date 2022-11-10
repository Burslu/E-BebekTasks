package PatikaCohorts.BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int healty;
    int weight;
    int dodge;


    public Fighter(String name , int damage , int healty , int weight ,int dodge){
        this.name   = name;
        this.damage = damage;
        this.healty = healty;
        this.weight = weight;
        this.dodge  = dodge;
    }

    int  hit(Fighter foe){
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " Hasar vurdu.");
        if (foe.isDodge()){
            System.out.println(foe.name + "Gelen hasari blokladim");
        }
        if (foe.healty - this.damage < 0){
            return 0;
        }
        return foe.healty - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() *100;
        return randomNumber <= this.dodge;

    }

}
