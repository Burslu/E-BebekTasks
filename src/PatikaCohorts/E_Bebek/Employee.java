package PatikaCohorts.E_Bebek;

public class Employee {
    // isim maas calisma saati calistigi yil sayisi adi altinda degiskenlerimiz tanimladik.
    private String name;
    private double salary;
    private int workHours;
    private int    hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){// calisanlara ait metod

        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
        this.workHours = workHours;
    }
    public double tax() {
        if (this.salary > 1000) {//calisanin maasi 1000 den buyuk ise
            return this.salary * 3 / 100;// yuzde 3 vergi aliniyor.
        }
        return 0;
    }
    public int bonus(){
        if (workHours>40){// calisma saati 40 saatin uzerinde ise ekstra calisma saati basina 30 tl ekstra ucret aliyor calisan .
            return (this.workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(){
        if(2021-this.hireYear<10){//calisanin calisma suresine gore  ekstra zam hesabi
           return  ((this.salary+bonus()-tax()) *5/ 100);
        } else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return  ((this.salary+bonus()-tax()) *10/ 100);
        } else if (2021-this.hireYear>19) {
            return  ((this.salary+bonus()-tax()) *15/ 100);
        }
        return 0;
    }

    @Override
    public String toString() {// ekran ciktimiz .
        return "Adı : " +name+"\n"+
                "Maaşı : "+salary+"\n"+
                "Çalışma Saati : "+workHours+"\n"+
                "Başlangıç Yılı : "+hireYear+"\n"+
                "Vergi : "+tax()+"\n"+
                "Bonus : "+bonus()+"\n"+
                "Maaş Artışı : "+raiseSalary()+"\n"+
                "Vergi ve Bonuslar ile birlikte maaş : "+(salary+bonus()-tax())+"\n"+
                "Toplam Maaş : "+(salary+bonus()-tax()+raiseSalary());
    }
}
