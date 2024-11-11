
// Develop an abstract class “GeometricObject” which will have two member variables color and weight. It would
// have constructor function for setting the color as “White” and weight as “1.0” as default values. The class should
// have methods getColor() and getWeight() to return the color and weight values to the caller. The class should
// have two abstract methods findArea() and findCircumference(). Write a subclass for “GeometricObject” called
// “Triangle” which will able to calculate area and circumference for a triangle.


abstract class GeometricObject{
    private String color;
    private double weight;
    public GeometricObject(){
        this.color="white";
        this.weight=1.0;
    }
    public GeometricObject(String color, int weight){
        this.color=color;
        this.weight=1;
    }
    public String getcolor(){
        return color;
    }

    public double getweight(){
        return weight;
    }

    abstract double findarea();

    abstract double findperimeter();
}


class Triangle extends GeometricObject{
    private double s1;
    private double s2;
    private double s3;
    public Triangle(double s1,double s2,double s3){
        super();
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    double findarea(){
        double s = (s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }

    double findperimeter(){
        return s1+s2+s3;
    }
}

class Assg8d{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 23, 23);
        System.out.println("The perimeter of the triangle is:"+triangle.findperimeter());
        System.out.println("The area of the triangle is:"+triangle.findarea());
        System.out.println("The color of the triangle is:"+triangle.getcolor());
        System.out.println("The weight of the triangle is:"+triangle.getweight());

    }
}