

//Write a java program which will take radius of a Circle as user input and calculate area and perimeter to display 
//the results.


import java.util.Scanner;
public class Assg1b{
       public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.out.print("Enter the radius of the circle:");
             double radius = input.nextDouble();
             double perimeter = 2*3.14*radius;
             double area = 3.14*radius*radius;
             System.out.println("The area of the circle is : "+area);
             System.out.println("The perimeter of the circle is: "+perimeter);
             input.close();
       }
}

             
            