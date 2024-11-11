// Write a Java Program to create an abstract class named Shape that contains two integers and an empty method
// named print Area(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes
// extends the class Shape. Each one of the classes contains only the method print Area () that prints the area of the
// given shape.

import java.util.Scanner;

abstract class Shape{
    protected int a;
    protected int b;
    public Shape(int a,int b){
        this.a=a;
        this.b=b;
    }
    abstract double printArea();
}

class Rectangle extends Shape{
    private int width;
    private int length;
    public Rectangle(int width,int length){
        super(width, length);
    }
    double printArea(){
        return a*b;
    }
}
class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle(int base,int height){
        super(base, height);
    }
    double printArea(){
        return a*b*0.5;
    }
}
class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        super(radius, 0);
    }
    double printArea(){
        return Math.PI*a*a;
    }
}

public class Assg8e{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 34);
        Shape triangle = new Triangle(2, 5);
        Shape circle = new Circle(23);
        System.out.println("The area of Rectangle: "+rectangle.printArea());
        System.out.println("The area of Circle: "+circle.printArea());
        System.out.println("The area of Triangle: "+triangle.printArea());

    }
}
