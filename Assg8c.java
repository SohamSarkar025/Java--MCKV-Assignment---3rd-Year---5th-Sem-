// Create an abstract base class called called “2Dfigure” that holds two dimensions of a figure. It also declares an
// abstract function called calculateArea() that when overridden by derived classes returns the area of type 2Dfigure
// defined by the derived class. Create two derived classes “Rectangle” and “Triangle” that inherit “2Dfigure”. Write
// a main() function to create object of these classes and display the area of rectangle and triangle.(Use base class
// reference to call a function).



import java.util.Scanner;
abstract class figure{
    protected double dimension1;
    protected double dimension2;
    public figure(double dimension1,double dimension2){
        this.dimension1=dimension1;
        this.dimension2=dimension2;
    }

    abstract double calculateArea();
}
class Rectangle extends figure{
    public Rectangle(double width, double length){
        super(width, length);
    }

    double calculateArea(){
        return dimension1*dimension2;
    }
}
class Triangle extends figure{
    public Triangle(double base,double height){
        super(base, height);
    }

    double calculateArea(){
        return 0.5*dimension1*dimension2;
    }
}



public class Assg8c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the width:");
        double width = in.nextDouble();
        System.out.print("Enter the lenght:");
        double length = in.nextDouble();

        figure ob = new Rectangle(width,length);

        System.out.println("The area of the Rectangle is: "+ob.calculateArea());

        System.out.print("Enter the base:");
        double base = in.nextDouble();
        System.out.print("Enter the height:");
        double height = in.nextDouble();

        figure ob1 = new Triangle(base,height);

        System.out.println("The area of the Triangle is: "+ob1.calculateArea());   
    }
    
}
