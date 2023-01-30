public class Main {
    public static void main(String[] args) {
        library lib = new library();
        lib.add_class_details("primary One","Mr. John");
        lib.add_class_details("primary Two","Mr. Lucy");
        lib.add_class_details("primary Three","Mr. 0nah");
        lib.getClassList();

        System.out.println("\n");
        
        lib.add_student_details("chris Ogwuche", 212, 23, "primary one");
        lib.add_student_details("james", 234, 12, "primary Two");
        lib.add_student_details("mike", 767, 7, "primary Three");
        lib.getStudentList();
//

        lib.signin(212);
        //        lib.signin("212");
        //        lib.signout("212");
        //        lib.get_Students_in_class("two");

        lib.check();
    }
}