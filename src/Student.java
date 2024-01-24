public class Student{
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average =0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >=0 && note1 <=100){
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100){
            this.c3.note = note3;
        }

    }
    void addBulkExamNoteNoteFirstLesson(int noteOral, int noteWritten){
        this.c1.note =(noteOral * this.c1.oralNote )+ (noteWritten*this.c1.writtenNote);

        if (this.c1.note > 55){
            System.out.println("Your note is: "+ this.c1.note +" You passed from " +this.c1.name +" lesson! ");

        }else {
            System.out.println("Your note is: "+ this.c1.note +" You failed from  "+ this.c1.name +"Take this course again next year");
        }
    }

    void addBulkExamNoteNoteSecondLesson(int noteOral, int noteWritten){
        this.c2.note =(noteOral * this.c2.oralNote )+ (noteWritten*this.c2.writtenNote);

        if (this.c2.note > 55){
            System.out.println("Your note is: "+ this.c2.note +" You passed from "+this.c2.name +" lesson! ");

        }else {
            System.out.println("Your note is: "+ this.c2.note +" You failed from  "+ this.c2.name +"Take this course again next year");
        }
    }
    void addBulkExamNoteNoteThirdLesson(int noteOral, int noteWritten){
        this.c3.note =(noteOral * this.c3.oralNote )+ (noteWritten*this.c3.writtenNote);

        if (this.c3.note > 55){
            System.out.println("Your note is: "+ this.c3.note +" You passed from "+this.c3.name +" lesson! ");

        }else {
            System.out.println("Your note is: "+ this.c3.note +" You failed from  "+ this.c3.name +" Take this course again next year");
        }
    }

    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) /3.0;
        if(this.average >55){
            System.out.println("Hababam sınıfı uyanıor! ");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı, sınıfta kaldı! ");
            this.isPass = false;

        }

        printNote();
    }

    void printNote(){
        System.out.println(c1.name + " Notu\t: " + this.c1.note);
        System.out.println(c2.name + " Notu\t: " + this.c2.note);
        System.out.println(c3.name + " Notu\t: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
