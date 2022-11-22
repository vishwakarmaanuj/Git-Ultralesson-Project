package com.ultraLesson.objectOrientation.collections;

import javax.swing.text.TabSet;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int section;
    public Student(String name,int age,int section){
        this.name=name;
        this.age=age;
        this.section=section;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSection() {
        return section;
    }

    public static void main(String[] args) {
        Student student=new Student("Anuj",23,6);
        Student st=new Student("Ramesh",5,6);
        Student stt=new Student("Mukesh",22,5);
        Student sttt=new Student("Suresh",24,6);
        ArrayList<Student> list=new ArrayList<>();
        list.add(student);
        list.add(st);
        list.add(stt);
        list.add(sttt);
        for(int i=0;i<list.size();i++) {
            if (list.get(i).getSection()==6) {
                System.out.println(list.get(i).name);
            }
        }
    }
}
