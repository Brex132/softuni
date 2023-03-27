package OOP.StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
    public String getCommentary(){
        if (grade >= 6){
            return "Excellent student.";
        }else if(grade >= 5){
            return "Average student.";
        }else{
            return "Very nice person.";
        }
    }
}
