import java.util.ArrayList;
import java.util.List;
public class library extends school implements lib {
    private int book_id;
    private String book_name;
    List<student> Signin_LibraryRegister = new ArrayList<>();
    List<student> Signout_LibraryRegister = new ArrayList<>();


    public void signin(int admission_number){
        for(student a: super.school_students){
            if(a.admission_number == admission_number){
                Signin_LibraryRegister.add(new student(a.student_name,a.admission_number,a.class_name,super.today));
            }
        }
    }

    public void signout(int admission_number) {
        for(student a: Signin_LibraryRegister){
            if(a.admission_number == admission_number){
                Signout_LibraryRegister.add(new student(a.student_name,a.admission_number,a.class_name,super.today));
            }
        }
    }
    public void check(){
        for(student a: Signin_LibraryRegister){
            System.out.println(a.student_name+ " "+a.admission_number+ " "+a.class_name+" "+a.today);
        }
//        System.out.println(Signin_LibraryRegister);
//        System.out.println(Signout_LibraryRegister);
    }

    public void request_Book() {

    }

    public void assign_book() {

    }
}
