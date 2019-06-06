package io.zipcoder;

import java.util.*;
import java.util.Collections;
import org.junit.Assert;

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
        List<Student> newList = new ArrayList<Student>(Arrays.asList(students));
        int classSize = students.length;
        newList.add(student);
        students = newList.toArray(new Student[classSize]);
   //     for(Student each : students){
   //         System.out.println(each.toString());
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
        int classSize = students.length;
         Collections.sort(sortedByScore);

        return students = sortedByScore.toArray(new Student[classSize]);
    }


    @Override
    public String toString() {
  //      return "Classroom: \n" + Arrays.toString(students);
    StringBuilder output = new StringBuilder();
        for (Student each : students) {
          output.append(each.toString());
        }
        return output.toString();
    }

    public void getGradeBook(Student student){
        List<Student> sortedByScore = new ArrayList<Student>(Arrays.asList(students));
        Double highest = (students[0].getAverageExamScore());
   //     System.out.println("The highest average is " + highest);

        if (student.getAverageExamScore() >= highest - (highest * .10)) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Grade is A");
        } else if (student.getAverageExamScore() > highest - (highest * .30) && student.getAverageExamScore() < (highest - (highest * .10))) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Grade is B");
        } else if (student.getAverageExamScore() > highest - (highest * .50) && student.getAverageExamScore() < (highest - (highest * .30))) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Grade is C");
        } else if (student.getAverageExamScore() > highest - (highest * .89) && student.getAverageExamScore() < (highest - (highest * .50))) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Grade is D");
        } else {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Grade is F");
        }

    }

}


