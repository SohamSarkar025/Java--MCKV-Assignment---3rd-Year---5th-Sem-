import java.util.Scanner;
class Practicedemo{
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

