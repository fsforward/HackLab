import java.util.Scanner;

/**
 * Class with the main method to start the program.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean running = true;
        while (running) {
            System.out.println();
            Menu.displayMainMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    StudentForm.addStudent(studentManager, scanner);
                    break;
                case 2:
                    studentManager.displayStudents();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
