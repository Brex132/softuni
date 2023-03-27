package OOP.StudentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository(){
        students = new ArrayList<>();
    }
    public void create(String name, int age, int grade){
        Student student = new Student(name,age,grade);
        students.add(student);
    }

    public Student getStudentByName(String name) {
        for (Student student: students) {
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
