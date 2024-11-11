
import java.util.Scanner;

class Assg7b{
    void Toh(int n,String s, String d,String h){
        if(n<=0){
            return;
        }
        else{
            Toh(n-1, s, h, d);
            System.out.println("Disk"+n+" moved to "+s+" to "+d);
            Toh(n-1, h, d, s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assg7b t1 = new Assg7b();
        System.out.println("Enter the no of disk: ");
        int n = sc.nextInt();
        t1.Toh(n, "Source", "Destination", "Helper");
        sc.close();
    }
}