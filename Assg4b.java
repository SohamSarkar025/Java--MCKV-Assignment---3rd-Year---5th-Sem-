

//Write a java program to generate Fibonacci Series up-to n terms using loop.


import java.util.Scanner;
class Assg4b{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the terms you want to print the fibonacci series:");
        int number = in.nextInt();
        System.out.println("The fibonacci numbers are till "+number+" terms..");
        in.close();
        int num1=0 ,num2=1;
        while(num1<=number){
            System.out.print(num1+", ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}