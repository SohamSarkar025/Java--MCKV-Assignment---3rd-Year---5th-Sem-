// Declare a class student that represents the following hierarchical information- id, name (First, Middle, Last),
// Gender, DOB (day, month, year), marks of 3 subjects considering an 1D array (English, Mathematics, Computer
// Science). To store the name and DOB use the concept aggregation. Write a java program to store and display the
// database of n students by using array of objects. Also write methods to search a particular student (based on id or
// name) from array and display his/her details.



import java.util.Scanner;
class Name{
    private String firstName;
    private String middleName; 
    private String lastName;

    public Name(String firstName,String middleName,String lastName){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }
    public String toString(){
        return firstName+" | "+middleName+" | "+lastName ;
    }
}
class Dob{
    private int day;
    private int month; 
    private int year;

    public Dob(int day ,int month , int year ){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return day+" | "+month+" | "+year ;
    }
}



class Student{
    private int id;
    private Name name;
    private String gender;
    private Dob dob;
    private double[] marks;
    public Student(int id,Name name,String gender, Dob dob,double[] marks){
        this.id=id;
        this.name= name;
        this.gender=gender;
        this.dob=dob;
        this.marks=marks;
    }

    public int getId(){
        return id;
    }
    public Name getName(){
        return name;
    }

    public void displaydetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Dob: "+dob);
        System.out.println("English: "+marks[0]);
        System.out.println("Math: "+marks[1]);
        System.out.println("Computer Science: "+marks[2]);
    }
}


public class Assg7d{
    private Student[] students;
    private int count;

    public Assg7d(int size){
        students = new Student[size];
        count =0;
    }
    public void addStudent(Student student){
        if(count<students.length){
            students[count++] = student;
        }
        else{
            System.out.println("Database is full...");
        }
    }
    public void displayall(){
        for(int i=0;i<count;i++){
            students[i].displaydetails();
        }
    }
    public void searchbyid(int id){
        for(int i=0;i<count;i++){
            if(id==students[i].getId()){
                students[i].displaydetails();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    public void searchbyname(String name){
        boolean found=false;
        for(int i=0;i<count;i++){
            if( students[i].getName().toString().toLowerCase().contains(name.toLowerCase())){
                students[i].displaydetails();
                found=true;
            }
        }
        if(!found){
            System.out.println("Student with name " + name+ " not found.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Student");
        Assg7d database = new Assg7d(sc.nextInt());
        database.addStudent(new Student(1,new Name("Soham","","Sarkar"),"Male",new Dob(25,7,2004),new double[]{89,90,99}));
        database.addStudent(new Student(2,new Name("Antara","","Maity"),"Female",new Dob(16,10,2004),new double[]{90,98,100}));
        System.out.println("All Students:");
        database.displayall();

                // Search by ID
                System.out.print("Enter student ID to search: ");
                int searchId = sc.nextInt();
                database.searchbyid(searchId);
        
                // Search by name
                System.out.print("Enter name to search: ");
                sc.nextLine(); // consume newline
                String searchName = sc.nextLine();
                database.searchbyname(searchName);
        
               sc.close();
    }  
}