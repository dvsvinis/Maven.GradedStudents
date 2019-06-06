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
        Student s1 = new Student("student","one", s1Scores);
        Student[] students = new Student[]{s1};
        Classroom classroom = new Classroom(students);

        for (Student each : students)
        System.out.println(each.toString());
    }

    @Test
    public void getAverageExamScore() {
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
        System.out.println(classroom.getAverageExamScore());

        Double expected = 81.5;
        Assert.assertEquals(expected, classroom.getAverageExamScore(), .01);
    }



    @Test
    public void addStudent() {
        ArrayList<Double> s1Scores = new ArrayList<Double>();
        s1Scores.add(90.0);
        s1Scores.add(91.0);
        Student s1 = new Student("student","one", s1Scores);
        Student[] students = new Student[]{s1};
        Classroom classroom = new Classroom(students);

        ArrayList<Double> s2Scores = new ArrayList<Double>();
        s2Scores.add(65.0);
        s2Scores.add(60.0);
        Student s2 = new Student("student","two", s2Scores);
        classroom.addStudent(s2);

        System.out.println(classroom.toString());

    }

    @Test
    public void removeStudent() {
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
        System.out.println(classroom.toString());

        classroom.removeStudent("student","one");
        System.out.println(classroom.toString());
    }

    @Test
    public void getStudentsByScore() {
        ArrayList<Double> s1Scores = new ArrayList<Double>();
        s1Scores.add(90.0);
        s1Scores.add(91.0);
        ArrayList<Double> s2Scores = new ArrayList<Double>();
        s2Scores.add(70.0);
        s2Scores.add(75.0);
        ArrayList<Double> s3Scores = new ArrayList<Double>();
        s3Scores.add(100.0);
        s3Scores.add(99.0);
        ArrayList<Double> s4Scores = new ArrayList<Double>();
        s4Scores.add(20.0);
        s4Scores.add(30.0);
        Student s1 = new Student("student","one", s1Scores);
        Student s2 = new Student("student","two", s2Scores);
        Student s3 = new Student("student","three", s3Scores);
        Student s4 = new Student("student","four", s4Scores);
        Student[] students = new Student[]{s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);
 //       System.out.println(classroom.toString());

        classroom.getStudentsByScore();
        System.out.println(classroom.toString());

    }
}
