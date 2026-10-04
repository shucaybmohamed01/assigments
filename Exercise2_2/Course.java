package Exercise2_2;

public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] larger = new String[students.length * 2];
            System.arraycopy(students, 0, larger, 0, numberOfStudents);
            students = larger;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        System.arraycopy(students, 0, result, 0, numberOfStudents);
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        String[] names = {"anas", "Amina", "Hassan", "mahad", "abdalla", "nicma"};
        for (String n : names) {
            course.addStudent(n);
        }
        System.out.println("Number of students: " + course.getNumberOfStudents());

        course.dropStudent("Hassan");
        System.out.println("After dropping Hassan: " + course.getNumberOfStudents());
        for (String s : course.getStudents()) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
