
class classRoom {
    public int no_of_students;
    public String name_of_class;
    public String teacher_name;
    classRoom(String name_of_class, String teacher_name, int no_of_students) {
        this.name_of_class = name_of_class;
        this.no_of_students = no_of_students;
        this.teacher_name = teacher_name;
    }
    classRoom(String name_of_class, String teacher_name) {
        this.name_of_class = name_of_class;
        this.teacher_name = teacher_name;
    }
    classRoom(String name_of_class) {
        this.name_of_class = name_of_class;
    }

}
