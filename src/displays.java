import java.util.List;

public interface displays {
    void add_student_details(String student_name,int admission_number,int age,String class_name);
    void add_class_details(String name_of_class,String teacher_name);
    void get_Students_in_class(String class_name);
    List<student> getStudentList();
}
