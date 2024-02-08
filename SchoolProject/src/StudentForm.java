import java.util.Scanner;

/**
 * Class to handle user input for adding a student.
 */
public class StudentForm {
    /**
     * Method to gather input from the user and add a new student to the manager.
     * @param studentManager The StudentManager object to add the new student to.
     * @param scanner The Scanner object to read user input.
     */
    public static void addStudent(StudentManager studentManager, Scanner scanner) {
        System.out.println("Adding a new student:");

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student classroom: ");
        String classroom = scanner.nextLine();

        Student newStudent = new Student(studentId, name, age, classroom);
        studentManager.addStudent(newStudent);
        System.out.println("Student added successfully.");
    }
}
