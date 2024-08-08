
//A. Write a java program to calculate y = pow(x,n) where x and n are user inputs, using loop.


import java.util.Scanner;
public class Assg4a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = in.nextDouble();
        System.out.println("Enter the value of N: ");
        double n = in.nextDouble();
        in.close();
        double y;
        for(int i=0;i<=n;i++){
            y = Math.pow(x,i);
            System.out.println(y);
        }
    }
}
