package CodingPracticeInterviewQuestions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//for assigning each course to a student at the same position

class StudentTest {
    public static void main(String[] args) {
        final List<String> students = Arrays.asList("Student A", "Student B");
        final List<String> courses = Arrays.asList("Course A", "Course B");

        List<StudentCourse> studentCourses = IntStream
            .range(0, students.size())
            .mapToObj(p -> new StudentCourse(students.get(p), courses.get(p)))
            .collect(Collectors.toList());

        for (StudentCourse studentCourse : studentCourses) {
            System.out.println(studentCourse);
        }
    }
}

class StudentCourse {
    private final String studentName;
    private final String courseName;

    public StudentCourse(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}