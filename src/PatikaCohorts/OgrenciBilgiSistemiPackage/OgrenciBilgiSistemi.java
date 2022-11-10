package PatikaCohorts.OgrenciBilgiSistemiPackage;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        TeacherClass teacher1 = new TeacherClass("Berkay Uslu","051775434154","math");
        TeacherClass teacher2 = new TeacherClass("Ahmet Ferda","054534745114","Fizik");
        TeacherClass teacher3 = new TeacherClass("Nuri Ceylan","053456832159","Kimya");
        TeacherClass teacher4 = new TeacherClass("Aylin Herin","051567834155","Biyoloji");

        Course math = new Course("Matematik" ,"01","math");
        math.addTeacher(teacher1);
        math.printTeacher();
        Course Fizik = new Course("Fizik" ,"02","Fizik");
        Fizik.addTeacher(teacher2);
        Fizik.printTeacher();
        Course Kimya = new Course("Kimya" ,"03","Kimya");
        Kimya.addTeacher(teacher3);
        Kimya.printTeacher();
        Course Biyoloji = new Course("Biyoloji" ,"04","Biyoloji");
        Biyoloji.addTeacher(teacher4);
        Biyoloji.printTeacher();


        StudentClass student1 = new StudentClass("bilge","12","3",math,Fizik,Kimya,Biyoloji);
        StudentClass student2 = new StudentClass("bilge","12","3",math,Fizik,Kimya,Biyoloji);
        //StudentClass student3 = new StudentClass("bilge","12","3",math,Fizik,Kimya,Biyoloji);
        //StudentClass student4 = new StudentClass("bilge","12","3",math,Fizik,Kimya,Biyoloji);
        System.out.println("\n");
        System.out.println("ogrenci 1 ");
        student1.addNote(100,50,22,55);
        student1.ispassQuiz();
        System.out.println("\n");
        System.out.println("ogrenci 2");
        student2.addNote(70,40,42,58);
        student2.ispassQuiz();

        /// DIGER OGRENCI ORNEKLERI ///
       // student3.addNote(90,42,32,44);
        //student4.addNote(50,50,22,45);
        // student3.printNoteResult();
        //student4.printNoteResult();


    }

}
