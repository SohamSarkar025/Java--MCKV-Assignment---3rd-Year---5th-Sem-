
// A. Create a class Room which will store width, height and breadth of the room in three variables. Create another class 
// Roomdemo which will use earlier class, create instances of rooms, set the values of variables and would calculate 
// volume of the rooms.
import java.util.Scanner;
class Room{
    private double width;
    private double height;
    private double breadth;
    public Room(double width,double height,double breadth){
        this.breadth=breadth;
        this.height=height;
        this.width=width;
    }
    public double calculateVolume(){
        return width*height*breadth;
    }
}
class Assg7a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Room:");
        int n= sc.nextInt();
        Room[] room = new Room[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the dimension of Room:"+(i+1));
            System.out.println("Enter the width:");
            double width=sc.nextDouble();
            System.out.println("Enter the breadth:");
            double breadth=sc.nextDouble();
            System.out.println("Enter the height:");
            double height=sc.nextDouble();
            

            room[i]  = new Room(width,height,breadth);
        }
          
        //Calculate the volume of the rooms
        for(int i=0;i<n;i++){
            System.out.println("The Volume of the Room "+(i+1)+" is "+room[i].calculateVolume());
        }
        sc.close();
    }
}
