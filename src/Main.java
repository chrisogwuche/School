public class Main {
    public static void main(String[] args) {
        school sch = new school();
        sch.add_student_details("chris ogwuche",212,23,"primary one");
        sch.add_student_details("james",234,12,"primary Two");
        sch.add_student_details("mike",767,7,"primary Three");
        System.out.println(sch.getStudentList());

        sch.add_class_details("primary Two","Mr. John",23);
        System.out.println(sch.getTeacherList());

        // Enter name of class
        sch.get_Student_in_class("one");
    }
}