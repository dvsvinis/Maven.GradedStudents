package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getFirstName() {
        Student student = new Student("Leon",null, null );
        String expected = "Leon";
        Assert.assertEquals(expected, student.getFirstName());
    }

    @Test
    public void setFirstName() {
        Student student = new Student(null,null, null );
        student.setFirstName("Mary");
        String expected = "Mary";
        Assert.assertEquals(expected, student.getFirstName());
    }

    @Test
    public void getLastName() {
        Student student = new Student(null,"Jones", null );
        String expected = "Jones";
        Assert.assertEquals(expected, student.getLastName());
    }

    @Test
    public void setLastName() {
        Student student = new Student(null,null, null );
        student.setLastName("Jones");
        String expected = "Jones";
        Assert.assertEquals(expected, student.getLastName());
    }

    @Test
    public void getNumberOfExamsTaken() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student(null,null, scores);
        Integer expected = 3;
        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
    }

    @Test
    public void getExamScores() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student(null,null, scores);
        String expected = "Exam 1 -> 99.4\n" +
                "Exam 2 -> 92.4\n" +
                "Exam 3 -> 88.4\n";
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void addExamScore() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student(null,null, scores);
        student.getNumberOfExamsTaken();
        Integer expected = 3;
        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
        student.addExamScore(66.2);
        expected = 4;
        Assert.assertEquals(expected, student.getNumberOfExamsTaken());
    }

    @Test
    public void setExamScore() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student(null,null, scores);
        student.getExamScores();
        student.setExamScore(2, 55.0);
        String expected = "Exam 1 -> 99.4\n" +
                "Exam 2 -> 55.0\n" +
                "Exam 3 -> 88.4\n";
        Assert.assertEquals(expected, student.getExamScores());
    }

    @Test
    public void getAverageExamScore() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student(null,null, scores);
        System.out.println(student.getAverageExamScore());
        Double expected = 93.4;
        Assert.assertEquals(expected, student.getAverageExamScore(), .01);
    }

    @Test
    public void toString1() {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(99.4);
        scores.add(92.4);
        scores.add(88.4);
        Student student = new Student("Mary","Jones", scores);
        String expected = "Student Name: Mary Jones\n" +
                "Average Score: 93.40000000000002\n" +
                "Exam Scores: \n" +
                "Exam 1 -> 99.4\n" +
                "Exam 2 -> 92.4\n" +
                "Exam 3 -> 88.4\n";
        Assert.assertEquals(expected, student.toString());
    }

}