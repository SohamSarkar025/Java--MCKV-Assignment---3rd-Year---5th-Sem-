
//Write a java program to check whether a year is Leap Year using conditional operator.



//if a year is exactly divisible by 4 and not divisible by 100 then its Leap year.
//Else if year is exactly divisible 400 then its a Leap year.
//Else Normal year.

import java.util.Scanner;
class Assg3c{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = in.nextInt();
        boolean leap=false;
        in.close();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            else{
                leap=true;
            }
        }
        else{
            leap=false;
        }
        if(leap){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
