package com.example.f23comp1011s2w2challenge;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APIUtility {
    public static List<Student> getStudentsFromFile()
    {
        Gson gson = new Gson();
        Student[] students = null;

        try(
                FileReader fileReader = new FileReader("students.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
           students = gson.fromJson(jsonReader, Student[].class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return Arrays.asList(students);
    }
}
