package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {
    @Test
    public void getStudents() {
        ArrayList<Double> s1Scores = new ArrayList<Double>();
        s1Scores.add(90.0);
        s1Scores.add(91.0);
        ArrayList<Double> s2Scores = new ArrayList<Double>();
        s2Scores.add(70.0);
        s2Scores.add(75.0);

        Student s1 = new Student("student","one", s1Scores);
        Student s2 = new Student("student","two", s2Scores);
        Student[] students = new Student[]{s1, s2};
        Classroom classroom = new Classroom(students);

        for (Student each : students)
        System.out.println(each.toString());
    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void addStudent() {
 //       Double[] s1Scores = { 100.0, 150.0 }
 //       Double s2Scores = { 225.0, 25.0 }
//        Student s1 = new Student("student","one", s1Scores);
//        Student s2 = new Student("student","two", s2Scores);
//
//        Student[] students = new Student{s1,s2};
//        Classroom classroom = new Classroom(students);

 //       String expected = "Leon";
 //       Assert.assertEquals(expected, student.getFirstName());
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentsByScore() {
    }
}
