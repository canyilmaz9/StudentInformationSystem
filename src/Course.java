public class Course{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double oralNote;
    double writtenNote;

    Course(String name, String code, String prefix, double oralNote, double writtenNote){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note =0;
        this.oralNote = oralNote;
        this.writtenNote = writtenNote;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }


    }
    void printTeacherInfo(){


    }
    
}
