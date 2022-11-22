package com.ultraLesson.objectOrientation.objects;

public class Pencil {     //class
    private String color;    // Objects//fields
    private String shape;
    private int size;
    private int length;
    private int width;
    private int height;
    public Pencil(){ // Default constructor/No args cons
        color="red";
        shape="triangular";
        size= 4;
        length=3;
        width=2;
        height=1;
    }
    public Pencil(String pencilColor,String pencilShape,int pencilSize,int pencilLength,int pencilWidth,int pencilHeight){ // parametrized cons
        color=pencilColor;
        shape=pencilShape;
        size=pencilSize;
        length=pencilLength;
        width=pencilWidth;
        height=pencilHeight;
    }

}
