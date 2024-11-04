import java.util.Scanner;

class MathOperations{
    private int a;
    private int b;
    void add(int a,int b){
        this.a=a;
        this.b=b;
        int c=a;
        int d=b;
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        int sum=c+d;
        System.out.println("The sum is:"+sum);
    }
    void increase(int a,int b){
        this.a=a;
        this.b=b;
        a+=5;
        b+=5;
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("The increased value of a is "+a+" and b is "+b);  
    }
}
public class prctice{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathOperation Mathops = new MathOperation(12,15);
        Thread addThread= new Thread(()->Mathops.add());
        Thread increaseThread = new Thread(()->Mathops.increase());
        addThread.start();
        try{
            addThread.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        increaseThread.start();
        try{
            increaseThread.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Both task completed");
    }
}