package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        StringBuilder output = new StringBuilder();
        int count = 1;

        for (Double each : examScores){
            output.append("Exam " + count + " -> " + each + "\n");
            count++;
        }
        return output.toString();
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber - 1, newScore);

    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (Double each : examScores){
            sum += each;
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" +
        "Average Score: " +  getAverageExamScore() + "\n" +
        "Exam Scores: " + "\n" +
                getExamScores();
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAverageExamScore() > o.getAverageExamScore() ) {
            return -1;
        }
        else if (this.getAverageExamScore() < o.getAverageExamScore() ){
            return 1;
        }
        else {
            return 0;
        }
    }
}
