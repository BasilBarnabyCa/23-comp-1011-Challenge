package com.example.f23comp1011s2w2challenge;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Student {
    @SerializedName("STUDENTNUM")
    private String studentNum;

    @SerializedName("FirstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("Email")
    private String email;

    @SerializedName("courses")
    private List<Course> courses;

    public String getStudentNum() {
        return studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
