package com.aldina.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ArrayList<Student> studentList() {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students are you?");

        int totalStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            sc.nextLine();


            Student student = new Student(name, age);
            students.add(student);

        }

        sc.close();

        return students;

    }
}
