// Create a class called Employee which maintains the details of an employee (EID, Name, Basic, City). The class
// contain the following member function
// i) Takes all the details of Employee.
// ii) Shows the details of an employee
// iii) Find the gross salary of an employee.
// Create two subclasses Company1 and Company2 which inherits the parent class Employee but the salary structure
// is different than the Employee class. Override the function Salary() according to the company1’s and company2’s
// salary structure. Considering salary structure of Company1, AGP is 40% of the basic pay. Company provides 25%
// DA and 10% HRA on the merged basic (Basic+ AGP). Similarly, Company2 provides AGP 50% of the basic pay.
// They also provide 50% DA and 15% HRA on the merged basic (Basic+ AGP). Create a main class to instantiate
// several objects of these classes and implement the above-stated function.



import java.util.Scanner;
//Base Class

class Employee{
    protected int id;
    protected String Name;
    protected double Basic;
    protected String city;

    public void takedetils(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter id:");
        id = in.nextInt();
        System.out.print("Enter Name:");
        Name = in.next();
        System.out.print("Enter Basic Salary:");
        Basic = in.nextDouble();
        System.out.print("Enter City:");
        city = in.next();
    }

    public void showdetails(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+Name);
        System.out.println("Basic Salary:"+Basic);
        System.out.println("City:"+city);
    }

    public double grossSalary(){
        return Basic;
    }
}
class Company1 extends Employee{

    public double grossSalary(){
        double agp = (0.40*Basic);
        double mergebasic = agp+Basic;
        double da = 0.25*mergebasic;
        double hra = 0.10*mergebasic;
        return mergebasic +da +hra ;
    }
}
class Company2 extends Employee{

    public double grossSalary(){
        double agp = (0.50*Basic);
        double mergebasic = agp+Basic;
        double da = 0.50*mergebasic;
        double hra = 0.15*mergebasic;
        return mergebasic +da +hra ; 
    }
}



public class Assg8a{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of Employee:");
        int n= in.nextInt();
        Employee[] employees = new Employee[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter 1 for Company1 and 2 for Company2");
            int choice = in.nextInt();
            if(choice ==1){
                employees[i] = new Company1();
            }
            else{
                employees[i] = new Company2();
            }
            employees[i].takedetils();
        }
        for(Employee emp : employees){
            System.out.println("------- Employee Detials------");
            emp.showdetails();
            System.out.println("the Gross Salary:"+emp.grossSalary());
        }
    }
}















