import java.util.ArrayList;

/**
 * Class responsible for managing students, including adding and displaying them.
 */
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();;

    /**
     * Method to add a student to the list of students.
     * @param student The student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Method to display all students in the list.
     */
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Classroom: " + student.getClassroom());
        }
    }
}
