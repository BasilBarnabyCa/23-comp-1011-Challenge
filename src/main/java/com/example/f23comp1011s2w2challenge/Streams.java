package com.example.f23comp1011s2w2challenge;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Student> students = APIUtility.getStudentsFromFile();

        getStudentCount(students);
        getPassingStudentsInCourse(students, "COMP1008", 50);
        getStudentsWithNCourses(students, 4);
        getPassingStudentsWithNCourses(students, 4, 50);
        getAverageGradeOfCourse(students, "COMP1113");
        getBestStudent(students);
        getWorstStudent(students);
    }

    // Number 4
    public static void getStudentCount(List<Student> students) {
        System.out.printf("There are %d students in the array.\n", students.size());
    }

    // Number 5
    public static void getPassingStudentsInCourse(List<Student> students, String courseCode, int passingGrade) {
//        long passingStudents = students.stream()
//                .map(student -> student.getCourses())
//                .flatMap(courseStream -> courseStream.stream())
//                .filter(courseStream -> courseStream.getCourseCode().equals(course) && courseStream.getGrade() >= passingGrade)
//                .count();

        long passingStudents = students.stream()
                .filter(student -> student.getCourses().stream()
                        .anyMatch(c -> c.getCourseCode().equals(courseCode) && c.getGrade() >= passingGrade))
                .count();

        System.out.printf("There are %d students in %s with a grade of %d or higher\n", passingStudents, courseCode, passingGrade);
    }

    // Number 6
    public static void getStudentsWithNCourses(List<Student> students, int numberOfCourses) {
        long studentsWithNCourses = students.stream()
                .map(s -> s.getCourses())
                .filter(courses -> courses.size()  >= numberOfCourses)
                .count();

        System.out.printf("There are %d students with at least %d courses\n", studentsWithNCourses, numberOfCourses);
    }

    // Number 7
    public static void getPassingStudentsWithNCourses(List<Student> students, int numberOfCourses, int passingGrade){
        long passingStudentsWithNCourses = students.stream()
                .filter(student -> student.getCourses().stream()
                        .filter(course -> course.getGrade() >= passingGrade)
                        .count() >= numberOfCourses)
                        .count();

        System.out.printf("There are %d students with at least %d courses with a grade of at least %d\n", passingStudentsWithNCourses, numberOfCourses, passingGrade);
    }

    // Number 9
    public static void getAverageGradeOfCourse(List<Student> students, String courseCode) {
        OptionalDouble averageGrade = students.stream()
                .map(student -> student.getCourses())
                .flatMap(coures -> coures.stream())
                .filter(course -> course.getCourseCode().equals(courseCode))
                .mapToDouble(Course::getGrade)
                .average();

        if(averageGrade.isPresent()) {
            System.out.printf("The average grade for %s is %.2f%n", courseCode, averageGrade.getAsDouble());
        } else {
            System.out.printf("No grades available for %s%n", courseCode);
        }
    }

    // Number 10
    public static void getBestStudent(List<Student> students) {
        Optional<Student> studentWithHighestAverage = students.stream()
                .max(Comparator.comparingDouble(student ->
                        student.getCourses().stream()
                                .mapToDouble(Course::getGrade)
                                .average()
                                .orElse(0.0) // Default to 0 if no grades are present
                ));

        if (studentWithHighestAverage.isPresent()) {
            Student topStudent = studentWithHighestAverage.get();
            double averageGrade = topStudent.getCourses().stream()
                    .mapToDouble(Course::getGrade)
                    .average()
                    .orElse(0.0);

            System.out.printf("The student with the highest average is %s %s with an average of %.2f\n", topStudent.getFirstName(), topStudent.getLastName(), averageGrade);
        } else {
            System.out.println("No students available to calculate the highest average.");
        }
    }


    // Number 11
    public static void getWorstStudent(List<Student> students) {
        Optional<Student> studentWithLowestAverage = students.stream()
                .min(Comparator.comparingDouble(student -> student.getCourses().stream()
                        .mapToDouble(Course::getGrade)
                        .average()
                        .orElse(0.0)
                ));

        if (studentWithLowestAverage.isPresent()) {
            Student topStudent = studentWithLowestAverage.get();
            double averageGrade = topStudent.getCourses().stream()
                    .mapToDouble(Course::getGrade)
                    .average()
                    .orElse(0.0);

            System.out.printf("The student with the lowest average is %s %s with an average of %.2f\n", topStudent.getFirstName(), topStudent.getLastName(), averageGrade);
        } else {
            System.out.println("No students available to calculate the highest average.");
        }
    }

}
