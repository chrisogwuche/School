import java.util.ArrayList;
import java.util.List;

class school implements displays{
    List<classRoom> school_teachers = new ArrayList<>();
    List<student> school_students = new ArrayList();
    List<String> studentList = new ArrayList<>();
    List<String> classList = new ArrayList<>();
    public void add_student_details(String student_name,int admission_number,int age,String class_name) {
        school_students.add(new student(student_name, admission_number, age, class_name));
    }
    public List getStudentList(){
        for(student a : school_students) {
            System.out.println(a.admission_number);
            studentList.add(a.student_name);
            studentList.add(String.valueOf(a.admission_number));
            studentList.add(String.valueOf((a.age)));
            studentList.add(a.class_name);
        }
        return studentList;
    }
    public void add_class_details(String name_of_class,String teacher_name, int no_of_students){
        school_teachers.add(new classRoom(name_of_class,teacher_name,no_of_students));
    }
    public List getTeacherList(){
        for(classRoom a : school_teachers) {
            System.out.println(a.name_of_class);
            classList.add(a.name_of_class);
            classList.add(a.teacher_name);
            classList.add(String.valueOf((a.no_of_students)));
        }
        return classList;
    }

    public void get_Student_in_class(String class_name){
        for(student a: school_students){
            if(a.class_name.toLowerCase().contains(class_name)){
                System.out.println(a.class_name +" " +a.student_name);
            }
        }
    }

}

