package com.mycompany.collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class Collection {

    public static void main(String[] args) {
        
        
        
        //LIST digunakan untuk menunjukkan banyak kelas dan urutannya
        ArrayList<String> subjects = new ArrayList<>();
        
        subjects.add("Numerical Computation (NC)");
        subjects.add("Database System (DS)");
        subjects.add("Object Oriented Programming (OOP)");
        subjects.add("Desain and Analysis Algorithm (DAA)");
        subjects.add("Computer Organization (CO)");
        subjects.add("Linear Algebra (LA)");
        subjects.add("Statistic Probability (SP) ACCELERATION CLASS");
        
        System.out.println("==Subject List in Third Semester==\n");

        for(String i: subjects)
            System.out.println("- " + i);
        
        //MAP digunakan untuk -> kelas matematika ada n anak
        HashMap<String, Integer> students = new HashMap<>();
        
        students.put("NC", 17);
        students.put("DS", 24);
        students.put("OOP", 23);
        students.put("DAA", 19);
        students.put("CO", 24);
        students.put("LA", 25);
        students.put("SP", 10);
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nSee Class Participant\n(Input Class Code) : ");
        String choosenClass = s.nextLine();
        System.out.println(choosenClass + " = " + students.get(choosenClass) + " students right now");
        
        //SET digunakan untuk mencari nama anak yang belom terdaftar di kelas manapun
        
        HashSet<String> studentName = new HashSet<>();
        studentName.add("Andi");
        studentName.add("Rafif");
        studentName.add("Soleh");
        studentName.add("Danti");
        
        System.out.println("\nCheck your name\n(Input your name) : ");
        String yourName = s.nextLine();
        
        if(studentName.contains(yourName)) {
            System.out.println("Owch! You are not in the system yet");
        } else {
            System.out.println("Good! You are already in the system");
        }
        
        //QUEUE digunakan untuk kelas akselerasi (dimana satu kelas maks 10 tetapi apabila ada anak yang keluar maka anak di urutan ke 11 akan masuk)
        
        Queue<String> accelerationStudent = new LinkedList<>();
        accelerationStudent.add("Randi");
        accelerationStudent.add("Lea");
        accelerationStudent.add("Deno");
        accelerationStudent.add("Sani");
        accelerationStudent.add("Beni");
        accelerationStudent.add("Zio");
        accelerationStudent.add("Wildan");
        accelerationStudent.add("Eric");
        accelerationStudent.add("Dari");
        accelerationStudent.add("Alfa");
        
        System.out.println("\nRegister your name to this class\n(Input your name) : ");
        String registerName = s.nextLine();
        
        accelerationStudent.add(registerName);
        int position = accelerationStudent.size() - 10;
        
        if (accelerationStudent.size() >= 10) {
            System.out.println("Acceleration Class is full\nYou are in line " + position);
        } else {
            System.out.println("You are registered in the acceleration class");
        }
    }
}
