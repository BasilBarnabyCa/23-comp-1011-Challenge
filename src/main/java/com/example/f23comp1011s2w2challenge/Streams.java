package com.example.f23comp1011s2w2challenge;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Student> students = APIUtility.getStudentsFromFile();

        getStudentCount(students);
        getPassingStudentsInCourse(students, "COMP1008", 50);
        getStudentsWithNCourses(students, 4);
//        getPassingStudentsWithNCourses(students, 4, 50);
    }

    public static void getStudentCount(List<Student> students) {
        System.out.printf("There are %d students in the array.\n", students.size());
    }

    public static void getPassingStudentsInCourse(List<Student> students, String course, int passingGrade) {

        /**
            1. First we stream students.
            2. Because each student has multiple course objects, when then stream each of those course objects, however we use a
            flatMap to flatted these objects into one array eg.
                {
                    course : "1003"
                    grade : 50
                }
                {
                    course: "1001"
                    grade: 60
                }
            When flattened  becomes
            ["1003", "50", "1001", "60"]
            3. Use filter with conditions on grade
            4. Use terminating function. This case count is used to get the total count of the results from the conditions
         */


        long passingStudents = students.stream()
                .map(s -> s.getCourses())
                .flatMap(courses -> courses.stream())
                .filter(c -> c.getGrade() >= passingGrade && c.getCourseCode().equals(course))
                .count();

        System.out.printf("There are %d students in %s with a grade of %d or higher\n", passingStudents, course, passingGrade);
    }

    public static void getStudentsWithNCourses(List<Student> students, int numberOfCourses) {
        long studentsWithNCourses = students.stream()
                .map(s -> s.getCourses())
                .filter(courses -> courses.size()  >= numberOfCourses)
                .count();

        System.out.printf("There are %d students with at least %d courses\n", studentsWithNCourses, numberOfCourses);
    }

//    public static void getPassingStudentsWithNCourses(List<Student> students, int numberOfCourses, int passingGrade) {
//        long passingStudentsWithNCourses = students.stream()
//                .filter(
//                        s -> s.getCourses().size() >= numberOfCourses
//                                &&
//                                s.getCourses().stream()
//                                    .filter(c -> c.getGrade() >= passingGrade)
//                )
//                .count();
//
//        System.out.printf("There are %d students with at least %d courses and a grade of %d or higher%n", passingStudentsWithNCourses, numberOfCourses, passingGrade);
//    }
}
