package io.zipcoder;

import java.util.*;
import java.util.Collections;

public class Classroom {
    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom (){
        this.students = new Student[30];
    }

    public Classroom (int maxStudents){
        this.students = new Student[maxStudents];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for(Student each : students)
            sum += each.getAverageExamScore();
        return sum / students.length;
    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        List<Student> arrayList = new ArrayList<Student>(Arrays.asList(students));
        int classSize = students.length;
        for (Student each : students){
            if (each.getFirstName() == firstName && each.getLastName() == lastName) {
                arrayList.remove(each);
            }
        }
        students = arrayList.toArray(new Student[classSize]);
    }

    public Student[] getStudentsByScore(){

        List<Student> sortedByScore = new ArrayList<Student>(Arrays.asList(students));
        Collections.sort(sortedByScore, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.valueOf(s1.getAverageExamScore()).compareTo(s2.getAverageExamScore());
            }
        });

        Student[] output = new Student[sortedByScore.size()];
        return sortedByScore.toArray(output);
    }


}


