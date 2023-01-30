import java.sql.Timestamp;
import java.util.Date;

public class student {
    public String student_name;
    public int admission_number;
    public int age;
    public String class_name;
    long time = new Date().getTime();
    Timestamp today = new Timestamp(time);


    student(){}
    student(String student_name,int admission_number, int age,String class_name){
        this.student_name = student_name;
        this.class_name = class_name;
        this.admission_number = admission_number;
        this.age = age;
    }
    student(String student_name,int admission_number,String class_name,Timestamp today){
        this.student_name = student_name;
        this.class_name = class_name;
        this.admission_number = admission_number;
        this.today = today;
    }

}
