public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher courseTeacher){
        if(this.prefix.equals(courseTeacher.branch)){
            this.courseTeacher = courseTeacher;
            System.out.println("Ogretmen Atama Başarılı..."
                    +courseTeacher.name+" adlı Akademisyen, "+this.name+" dersine atandı.");
        }else {
            System.out.println(courseTeacher.name+" Akademisyeni bu derse atanamaz!");
        }
    }

    public void printTeacher(){
        if (this.courseTeacher != null){
            System.out.println(this.name+" dersi Akademisyeni : "+this.courseTeacher.name);
        }else {
            System.out.println(this.name+" dersine Akademisyen atanmamıştır...");
        }
    }

}
