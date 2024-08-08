
//Write a java program to generate all Prime Numbers within a range, where range is user input. 

import java.util.Scanner;
public class Assg4c {
    public static void main(String[] args){
        int lower,upper,i,j,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        lower = in.nextInt();
        System.out.println("Enter the upper bound:");
        upper = in.nextInt();
        in.close();
        System.out.println("All the Prime numbers within "+lower+" to "+upper);
        for(i=lower;i<=upper;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
                else{
                    flag=1;
                }
            }
            if(flag==1){
                System.out.print(i+", ");
            }
        } 
    }
}
