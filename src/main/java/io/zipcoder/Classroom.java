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

//    public void whenComparing_thenSortedByScore() {
//        Comparator<Student> studentByScoreComparator
//                = Comparator.comparing(Student::getAverageExamScore);
//
//        Arrays.sort(students, studentByScoreComparator);
//
// //      assertTrue(Arrays.equals(students, studentByScoreComparator));
//    }


    public Student[] getStudentsByScore(){

         List<Student> sortedByScore = new ArrayList<Student>(Arrays.asList(students));
        int classSize = students.length;
         Collections.sort(sortedByScore);

        return students = sortedByScore.toArray(new Student[classSize]);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

}


