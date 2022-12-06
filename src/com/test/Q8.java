package com.test;

import java.util.Scanner;

class Student{
    int roll;
    String name;
    double [] marks = new double[3];
    Student(){}
    Student(int roll, String name, double [] marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    double totalMarks(double marks[]) {
        int s=0;
        for(double i:marks)
            s+=i;
        return s;
    }
    double avgMarks(double marks[]){
        return totalMarks(marks)/3;
    }
    void display(Student [] s, int i){
        System.out.println("Name: "+s[i].name);
        System.out.println("Roll: "+s[i].roll);
        for (int j = 0; j < 3; j++) {
            System.out.println("Sub"+(j+1)+": "+s[i].marks[j]);
        }
        System.out.println("Total Marks: "+s[i].totalMarks(s[i].marks));
        System.out.println("Average Marks: "+s[i].avgMarks(s[i].marks));
    }
    void tdis (Student [] s, int f){
        int i = 0, flag = 0,temp=0;
        for (; i < s.length; i++) {
            if (f==(s[i].roll)) {
                flag = 1;
                display(s, i);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Invalid ID!!!");
        }
    }
}
class Q8 {
    public static void main(String[] args) {
        Scanner scI = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Enter no. of Students: ");
        int n = scI.nextInt();
        Student [] Stu = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll: ");
            int roll = scI.nextInt();
            System.out.print("Enter Name: ");
            String nm = scS.nextLine();
            double [] mk = new double[3];
            System.out.println("Enter 3 subjects marks:");
            for (int j = 0; j < mk.length; j++) {
                mk[j] = scI.nextDouble();
            }
            Stu[i] = new Student(roll, nm, mk);
        }
        System.out.print("Search by Roll: ");
        int k = scI.nextInt();
        st.tdis(Stu, k);
    }
}