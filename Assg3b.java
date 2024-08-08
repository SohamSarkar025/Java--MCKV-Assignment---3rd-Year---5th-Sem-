//In general an equation of the form 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0 is known as a quadratic equation. Accept the values of a, b,
//and c from the user and write a java program to calculate the roots of the given quadratic equation

import java.util.Scanner;
public class Assg3b{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = in.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = in.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = in.nextDouble();
        in.close();
        double d = ((b*b)-4.0*a*c);
        if(d>0){
            double x1 = (-b+Math.pow(d,0.5))/2*a;
            double x2 = (-b-Math.pow(d,0.5))/2*a;
            System.out.println("The roots are real and roots are R1 = "+x1+" R2 = "+x2);
        }
        else if(d==0){
            double x3 = (-b)/2*a;
            System.out.println("The roots are same and root is R1 = "+x3);
        }
        else{
            System.out.println("The roots are imaginary or not real");
        }
    }
}
