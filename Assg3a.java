

//Write a java program to identify largest among three numbers using Conditional Operator.

import java.util.Scanner;
public class Assg3a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double max,a,b,c;
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        in.close();
        if(a<b){
            max=b;
            if(b<c){
                max=c;
            }
            else{
                max=b;
            }
        }
        else{
            max=a;
            if(a<c){
                max=c;
            }
            else{
                max=a;
            }
        }
        System.out.println("The Largest among these numbers is: "+max);
    }
}
