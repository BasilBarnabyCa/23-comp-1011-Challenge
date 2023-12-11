package com.example.f23comp1011s2w2challenge;

import java.util.List;

public class TempTester {
    public static void main(String[] args) {
        List<Student> students = APIUtility.getStudentsFromFile();
        System.out.println(students);

//        getStudentCount(students);
//        getPassingStudents(students);
//        getStudentCountWithStreams(students);
//        getStudentWithNCourses(students, 4);
//        getPassingStudentsWithNCourses(students, 4);
//        getAverageGradeForCourse(students, "COMP1113");
    }

//    public static void getStudentCount(List<Student> students) {
//        System.out.printf("There are %d students in the array.\n", students.size());
//    }
//
//    public static void getPassingStudents(List<Student> students) {
//        int passingStudents = 0;
//        for (Student student : students) {
//            for (Course course : student.getCourses()) {
//                if (course.getGrade() >= 50) {
//                    passingStudents++;
//                    break;
//                }
//            }
//        }
//        System.out.printf("There are %d passing students.\n", passingStudents);
//    }
//
//    public static void getStudentCountWithStreams(List<Student> students) {
//
//        long passingStudents = students.stream()
//                .map(student -> student.getCourses())
//                .flatMap(courses -> courses.stream())
//                .filter(course -> course.getGrade() >= 50)
//                .filter(course -> course.getCourseCode().equals("COMP1008"))
//                .count();
//
//        System.out.printf("There are %d students in the array.\n", passingStudents);
//    }
//
//    public static void getStudentWithNCourses(List<Student> students, int n) {
//        long studentsWithNCourses = students.stream()
//                .map(student -> student.getCourses())
//                .filter(courses -> courses.size() >= n)
//                .count();
//
//        System.out.printf("There are %d students with %d courses.\n", studentsWithNCourses, n);
//    }
//
//    public static void getPassingStudentsWithNCourses(List<Student> students, int n) {
////        long passingStudents = students.stream()
////                .map(student -> student.getCourses())
////                .filter(courses -> courses.size() >= n)
////                .filter(courses -> courses.stream().anyMatch(course -> course.getGrade() >= 50))
////                .count();
//
//        long passingStudents = students.stream()
//                .filter(student -> student.getCourses().stream()
//                        .filter(course -> course.getGrade() >= 50)
//                        .count() >= 4)
//                .count();
//
//        long passingStudents = students.stream()
//                        .map(student -> student.getCourses())
//                                .map(courseStream -> courseStream.stream()
//                                        .filter(courses -> courses.size() >= n)
//                                        .filter(course -> course.getGrade() >= 50))
//                                        .count();
//
//        System.out.printf("There are %d passing students with %d courses.\n", passingStudents, n);
//    }
//
//    public static void getAverageGradeForCourse(List<Student> students, String courseCode) {
//        double averageGrade = students.stream()
//                .map(student -> student.getCourses())
//                .flatMap(courses -> courses.stream())
//                .filter(course -> course.getCourseCode().equals(courseCode))
//                .mapToDouble(course -> course.getGrade())
//                .average()
//                .getAsDouble();
//
//        System.out.printf("The average grade for %s is %.2f.\n", courseCode, averageGrade);
//    }
//
//    public static void getHighestAveragingStudent(List<Student> students) {
////        Student highestAveragingStudent = students.stream()
////                .max(Comparable)
//    }
}
