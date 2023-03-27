package OOP.StudentSystem;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {


        StudentRepository repository;

            repository = new StudentRepository();


            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                String command = scanner.nextLine();
                String[] commandParts = command.split(" ");

                switch (commandParts[0]) {
                    case "Create":
                        String name = commandParts[1];
                        int age = Integer.parseInt(commandParts[2]);
                        double grade = Double.parseDouble(commandParts[3]);
                        repository.create(name, age, (int) grade);
                        break;
                    case "Show":
                        String studentName = commandParts[1];
                        Student student = repository.getStudentByName(studentName);
                        if (student != null) {
                            System.out.println(student.getName() + " is " + student.getAge() + " years old. " + student.getCommentary());
                        } else {
                            System.out.println("Student not found.");
                        }
                        break;
                    case "Exit":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
            scanner.close();
        }

    }

