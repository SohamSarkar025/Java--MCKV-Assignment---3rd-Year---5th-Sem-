import java.util.Scanner;
public class Assg2a {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a = in.nextInt();
            System.out.println("Enter the value of b:");
            int b = in.nextInt();
            in.close();
            int c = a;
            a=b;
            b=c;
            System.out.println("After Swapping the value of a is "+a+" & The value of b is "+b);

    }
}

