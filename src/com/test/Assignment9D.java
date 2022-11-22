package com.test;
abstract class GeomatricObject{
    String color;
    float weight;
    public  GeomatricObject(){
        color="white";
        weight=1.0f;
    }
    String getColor(){
        return color;
    }
    float getWeight(){
        return weight;
    }

    abstract  float findArea();
    abstract float findCircumference();
}
class Traingle extends GeomatricObject{
    float l,b,h;

    public Traingle(float l, float b, float h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    float findArea(){
        return (b*h)/2;
    }
    float findCircumference(){
        return (l+b+h);
    }
}
public class Assignment9D {
    public static void main(String[] args) {
        Traingle t=new Traingle(2,3,4);
        System.out.println("Area= "+t.findArea());
        System.out.println("Circumference= "+t.findCircumference());
    }
}
