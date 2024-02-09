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
    public static Student addStudent(StudentManager studentManager, Scanner scanner) {
        System.out.println("Adding a new student:");

        System.out.print("Enter student ID: ");
        int studentId = getIntInput(scanner);
        clearScanner(scanner);

        System.out.print("Enter student name: ");
        String name = getStringInput(scanner);

        System.out.print("Enter student age: ");
        int age = getIntInput(scanner);
        clearScanner(scanner);

        System.out.print("Enter student classroom: ");
        String classroom = getStringInput(scanner);

        Student newStudent = new Student(studentId, name, age, classroom);
        System.out.println("Student added successfully.");
        return newStudent;
    }

    private static int getIntInput(Scanner scanner) {
        while(!scanner.hasNextInt()) {
            System.out.println("Invalid input, try again.");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    private static String getStringInput(Scanner scanner) {
        String input = scanner.nextLine();
        while(input.isEmpty()) {
            System.out.println("Invalid input, try again.");
            input = scanner.nextLine();
        }
        return input;
    }

    private static void clearScanner(Scanner scanner) {
        scanner.nextLine();
    }
}
