// Declare  a  class  student  that  represents  the  following  hierarchical  information-  id,  name  (First,  Middle,  Last), 
// Gender, DOB (day, month, year), marks of 3 subjects considering an 1D array (English, Mathematics, Computer 
// Science). To store the name and DOB use the concept aggregation. Write a java program to store and display the 
// database of n students by using array of objects. Also write methods to search a particular student (based on id or 
// name) from array and display his/her details.


class Name{
    private String firstname;
    private String middlename;
    private String lastname;
    public Name(String firstname,String middlename,String lastname){
        this.firstname=firstname;
        this.middlename=middlename;
        this.lastname=lastname;
    }
    public String getName(){
        return firstname+" "+middlename+" "+lastname;
    }
}

class Dob{
    private int day;
    private int month;
    private int year;
    public Dob(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String getDob(){
        return day+" | "+month+" | "+year;
    }
}

class Student{
    private int id;
    private Name name;
    private String gender;
    private Dob dob;
    private double[] marks;
    public Student(int id,Name name,String gender, Dob dob, double[] marks){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return ;
    }
    public void displaydetails(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Dob:"+dob);
        System.out.println("Marks:"+marks);
    }
}

class practiceclass{
    private Student[] students;
    private int count;
    public practiceclass(int size){
        students = new Student[size];
        count = 0;
    }
    public void addStudent(Student student){
        if(count<students.length){
            students[count++] = student;
        }
        else{
            System.out.println("Database is full: ");
        }
    }
    
}