// Write a java program to display the first n Non-Fibonacci terms using recursion. Create a separate class to define
// the non-static recursive function Fibo(int n).


import java.util.Scanner;

class Fibonacci{
    public int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
public class Assg7c{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Fibonacci ob = new Fibonacci();
        System.out.println("Enter the limit: ");
        int x= in.nextInt();
        for(int i=0;i<x;i++){
            System.out.print(ob.fibo(i)+", ");
        }
    }
}