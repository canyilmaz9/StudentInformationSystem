public class StudentInformationSystem {
    public static void main (String [] args){

        Teacher t1 = new Teacher("Mahmut", "TRH", "53185645");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "01111");

        Course tarih = new Course("Tarih", "101", "TRH", 0.3, 0.7);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", 0.2, 0.8 );
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO", 0.4, 0.6);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,85,50);
        s1.addBulkExamNoteNoteFirstLesson(90,60);
        s1.addBulkExamNoteNoteSecondLesson(80,70);
        s1.addBulkExamNoteNoteThirdLesson(48,55);
        s1.isPass();
    }

}

