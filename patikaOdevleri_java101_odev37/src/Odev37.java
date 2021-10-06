public class Odev37 {
    /**
     * @author Onur TAŞ, 2021...
     */
    public static void main(String[] args) {
        Course course1 = new Course("Matematik","MAT101","MAT");
        Course course2 = new Course("Fizik","FZK101","FZK");
        Course course3 = new Course("Kimya","KIM101","KIM");

        Teacher teacher1 = new Teacher("Mahmut Hoca","05551112233","MAT");
        Teacher teacher2 = new Teacher("Taylan Aydın","05554445566","FZK");
        Teacher teacher3 = new Teacher("Ali Hoca","05557778899","KIM");

        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban",4,"12332155",course1,course2,course3);
        student1.addBulkExamNote(90,90,95);
        student1.addVerbalNote(100,100,100);
        student1.isPass();


        Student student2 = new Student("Güdük Necmi",4,"22233449",course1,course2,course3);
        student2.addBulkExamNote(50,60,55);
        student2.addVerbalNote(30,30,100);
        student2.isPass();

        Student student3 = new Student("Prof. Onur",4,"12345678",course1,course2,course3);
        student3.addBulkExamNote(100,100,100);
        student3.addVerbalNote(100,100,100);
        student3.isPass();
    }
}
