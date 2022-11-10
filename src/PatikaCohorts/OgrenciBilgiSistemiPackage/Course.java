package PatikaCohorts.OgrenciBilgiSistemiPackage;

public class Course {
    TeacherClass teach;
    String name;
    String lessonCode;
    String prefix;
    int note,verbalNote;

    public Course(String name , String lessonCode , String prefix ){
        this.name       = name ;
        this.lessonCode = lessonCode;
        this.prefix     = prefix;
        int note        = 0;
    }
    void addTeacher(TeacherClass teach){
        if (this.prefix.equals(teach.branch)){
            this.teach = teach;
            System.out.println("Dogru islem");
            System.out.println("==================");
        }else{
            System.out.println("Bu dersi Bu ogretmen veremez!"+teach.name);
        }
    }

    public void printTeacher(){
        if (teach !=null){
            System.out.println(this.name + "Ogretmen :" + teach.name);
            System.out.println("=============================");
        }else {
            System.out.println(this.name+"====");
        }
        this.teach.print();

    }


}
