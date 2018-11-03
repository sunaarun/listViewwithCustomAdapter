package com.example.rasharun.listviewwithcustomadapter2;

public class Student {
    String name ;
    int imageID ;
    String GPA ;

   public Student(String n , int id , String gpa)
    {   this.name = n ;
        this.imageID = id;
        this.GPA = gpa;
    }

    public String getName() {
        return name;
    }

    public String getGPA() {
        return GPA;
    }

    public int getImageID() {
        return imageID;
    }

}
