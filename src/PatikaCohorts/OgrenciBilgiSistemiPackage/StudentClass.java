package PatikaCohorts.OgrenciBilgiSistemiPackage;

public class StudentClass {
    Course math;
    Course fizik;
    Course kimya;
    Course biyoloji;
    String name;
    String studenNumber;
    String classes;
    double avarage;
    boolean ispass;

    StudentClass(String name , String studenNumber , String classes , Course matematik , Course fizik , Course kimya,Course biyoloji){
        this.name         = name;
        this.studenNumber = studenNumber;
        this.classes      = classes;
        this.math         = matematik;
        this.fizik           = fizik;
        this.kimya = kimya;
        this.biyoloji = biyoloji;
        this.avarage      = 0.0;
        this.ispass       = false;
    }
    void addNote(int note1 , int note2 , int  note3 , int note4){
        if (note1>=0 && note1 <=100){
            math.note = note1;//disaridan aldigimiz note 1 e esit
        }
        if (note2>=0 && note2 <=100){
            fizik.note = note2;//disaridan aldigimiz note 2 e esit
        }
        if (note3>=0 && note3 <=100){
            kimya.note = note3;//disaridan aldigimiz note 3 e esit
        }
        if (note4>=0 && note4 <=100){
            biyoloji.note = note4;//disaridan aldigimiz note 4 e esit
        }

    }
    void verbalNote(int note1 , int note2 , int  note3 , int note4){
        if (note1>=0 && note1 <=100){
            math.verbalNote = note1;//disaridan aldigimiz note 1 e esit
        }
        if (note2>=0 && note2 <=100){
            fizik.verbalNote = note2;//disaridan aldigimiz note 2 e esit
        }
        if (note3>=0 && note3 <=100){
            kimya.verbalNote = note3;//disaridan aldigimiz note 3 e esit
        }
        if (note4>=0 && note4 <=100){
            biyoloji.verbalNote = note4;//disaridan aldigimiz note 4 e esit
        }

    }
    public  void  ispassQuiz(){
        calavarage();
        if (this.avarage > 55){
            System.out.println("Sinifi gectiniz " + this.avarage);
            this.ispass = true;
        }else {
            System.out.println("Kaldiniz :" + this.avarage);
            this.ispass = false;
        }
        printNoteResult();
    }
public void calavarage(){
        double matAvarage      = (this.math.note*0.8)+(this.math.verbalNote*0.2);
        double fizikAvarage    = (this.fizik.note*0.8)+(this.fizik.verbalNote*0.2);
        double kimyaAvarage    = (this.kimya.note*0.8)+(this.kimya.verbalNote*0.2);
        double biyolojiAvarage = (this.biyoloji.note*0.8)+(this.biyoloji.verbalNote*0.2);

        this.avarage = (matAvarage+fizikAvarage+kimyaAvarage+biyolojiAvarage)/4;
}
    void  printNoteResult(){
        System.out.println(math.name + "Notunuz:" + math.note);
        System.out.println(fizik.name + "Notunuz:" + fizik.note);
        System.out.println(kimya.name + "Notunuz:" + kimya.note);
        System.out.println(biyoloji.name + "Notunuz:" + biyoloji.note);
    }
}
