

// Consider the basic pay of an employee as user input. AGP is 50% of the basic pay. Company provides 50% DA
//and 15% HRA on the merged basic (Basic + AGP). Write a java program to calculate and display total salary of
//theemployee


import java.util.Scanner;
public class Assg2b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Basic Salary of the Employee:");
        double basicsal = in.nextDouble();
        in.close();
        double AGP = (basicsal*0.5);
        double da=(0.5*basicsal);
        double hra=(1.5*basicsal);
        double Basic=(da+hra);
        double totalsal=(AGP+Basic);
        System.out.println("The total Salary of the employee is: "+totalsal);
    }
}
