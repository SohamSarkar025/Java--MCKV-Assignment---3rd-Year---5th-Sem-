// Create a class Room which will store width, height and breadth of the room in three variables. Create another class 
// Roomdemo which will use earlier class, create instances of rooms, set the values of variables and would calculate 
// volume of the rooms.

import java.util.Scanner;
class Room{
    private double width;
    private double height;
    private double breadth;
    public Room(double width,double height,double breadth){
        this.width=width;
        this.height=height;
        this.breadth=breadth;
    }
    public double calculatevolume();
}

class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of room:");
        int n= in.nextInt();
        Room[] room = new Room[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the wiodth:");

        }
    }





}