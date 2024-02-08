/**
 * Class representing a student with the properties studentId, name, age, and classroom.
 */
public class Student {
    private int studentId;
    private String name;
    private int age;
    private String classroom;

    // Constructor
    public Student(int studentId, String name, int age, String classroom) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassroom() {
        return classroom;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
