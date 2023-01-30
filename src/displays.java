import java.util.List;

public interface displays {
    public void add_student_details(String student_name,int admission_number,int age,String class_name);
    public void add_class_details(String name_of_class,String teacher_name, int no_of_students);
    public void get_Students_in_class(String class_name);
    public List<classRoom> getClassList();
    public List<student> getStudentList();
}
