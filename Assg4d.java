
//Write a java program to reverse a number and check whether it is a Palindrome.



import java.util.Scanner;
public class Assg4d{
public static void main(String args[]){  
    int r,sum=0,temp;    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n= in.nextInt();
    in.close();
    temp=n;    
    while(n>0){    
     r=n%10;  //getting remainder  
     sum=(sum*10)+r;    
     n=n/10;    
    }    
    if(temp==sum)    
     System.out.println("palindrome number & the reverse is "+sum);    
    else    
     System.out.println("not palindrome & the reverse is "+sum);    
    }
}  

