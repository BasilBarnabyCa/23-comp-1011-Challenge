package com.example.f23comp1011s2w2challenge;

import com.google.gson.annotations.SerializedName;

public class Course {
    @SerializedName("courseCode")
    private String courseCode;

    @SerializedName("courseName")
    private String courseName;

    @SerializedName("GRADE")
    private int grade;

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }
}
