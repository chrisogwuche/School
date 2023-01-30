public class student {
    public String student_name;
    public int admission_number;
    public int age;
    public String class_name;


    student(){}
    student(String student_name,int admission_number, int age,String class_name){
        this.student_name = student_name;
        this.class_name = class_name;
        this.admission_number = admission_number;
        this.age = age;
    }
}
