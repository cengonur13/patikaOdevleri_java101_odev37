public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;

        // calcAverage() çağırılmış ama gereksiz gibi
    }

    public void addBulkExamNote(int course1, int course2, int course3){
        if(course1 >= 0 && course1 <= 100){
            this.course1.note = course1;
        }
        if(course2 >= 0 && course2 <= 100){
            this.course2.note = course2;
        }
        if(course3 >= 0 && course3 <= 100){
            this.course3.note = course3;
        }
    }

    public void addVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3){
        if(verbalNote1 >= 0 && verbalNote1 <= 100){
            this.course1.verbalNote = verbalNote1;
        }
        if(verbalNote2 >= 0 && verbalNote2 <= 100){
            this.course2.verbalNote = verbalNote2;
        }
        if(verbalNote3 >= 0 && verbalNote3 <= 100){
            this.course3.verbalNote = verbalNote3;
        }
    }

    public void isPass(){
        calcAverage();
        if((this.course1.verbalNote == 0 || this.course2.verbalNote == 0 || this.course3.verbalNote == 0)
        || (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0)){
            System.out.println("Sözlü veya Yazılı notların tamamı girilmemiştir...");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : "+this.average);
            if(this.isPass){
                System.out.println("Tebrikler, Sınıfı geçtiniz...");
            }else {
                System.out.println("Sınıfta kaldınız...");
            }
        }
    }

    public void calcAverage(){
        this.average = ((this.course1.note * 0.8 + this.course1.verbalNote * 0.2) +
                (this.course2.note * 0.8 + this.course2.verbalNote * 0.2) +
                (this.course3.note * 0.8 + this.course3.verbalNote * 0.2)) / 3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=================");
        System.out.println("Öğrenci : "+this.name);
        System.out.println(this.course1.name+" Notları : ");
        System.out.println("Yazılı -> "+this.course1.note+" Sözlü -> "+this.course1.verbalNote);
        System.out.println("Ders Ortalaması : "+(this.course1.note * 0.8 + this.course1.verbalNote * 0.2));
        System.out.println(this.course2.name+" Notları : ");
        System.out.println("Yazılı -> "+this.course2.note+" Sözlü -> "+this.course2.verbalNote);
        System.out.println("Ders Ortalaması : "+(this.course2.note * 0.8 + this.course2.verbalNote * 0.2));
        System.out.println(this.course3.name+" Notları : ");
        System.out.println("Yazılı -> "+this.course3.note+" Sözlü -> "+this.course3.verbalNote);
        System.out.println("Ders Ortalaması : "+(this.course3.note * 0.8 + this.course3.verbalNote * 0.2));
    }

}
