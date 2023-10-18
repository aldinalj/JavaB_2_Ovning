package com.aldina.demo;
import com.aldina.demo.TestLists;
import com.aldina.demo.Student;

import java.util.ArrayList;
import java.util.List;

import static com.aldina.demo.Student.studentList;

public class Main {

    public static void main(String[] args) {

        List arrayListTest = new TestLists().arrayListMethod();
        List linkedListTest = new TestLists().linkedListMethod();

        arrayListTest.add(1);
        arrayListTest.add(2);
        arrayListTest.add(3);

        arrayListTest.remove(2);

        arrayListTest.set(1,4);

        arrayListTest.get(1);

        System.out.println(arrayListTest);


        linkedListTest.add(1);
        linkedListTest.add(2);
        linkedListTest.add(3);

        linkedListTest.remove(2);
        linkedListTest.set(1,4);
        linkedListTest.get(1);

        System.out.println(linkedListTest);

        ArrayList<Student> students = studentList();

        for (Student student : students) {
            System.out.println("Name: " + student.name + " Age: " + student.age);

        }



    }
}


