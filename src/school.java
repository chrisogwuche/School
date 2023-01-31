import java.util.ArrayList;
import java.util.List;

class school extends student implements school_interface {
    List<classRoom> school_classes = new ArrayList<>();
    List<student> school_students = new ArrayList<>();


    public void add_student_details(String student_name,int admission_number,int age,String class_name) {
        school_students.add(new student(student_name, admission_number, age, class_name));
    }
    public List<student> getStudentList(){
        for(student a : school_students) {
            System.out.println(a.student_name+ " "+a.admission_number+ " "+a.age+" "+a.class_name);
        }
        return school_students;
    }
    public void add_class_details(String name_of_class,String teacher_name){
        school_classes.add(new classRoom(name_of_class,teacher_name));
    }
    public List<classRoom> getClassList(){
        for(classRoom a : school_classes) {
            System.out.println(a.name_of_class+ " "+a.teacher_name);
        }
        return school_classes;
    }
    public void get_Students_in_class(String class_name){
        for(student a: school_students){
            if(a.class_name.toLowerCase().contains(class_name)){
                System.out.println(a.class_name +" " +a.student_name);
            }
        }
    }

}

