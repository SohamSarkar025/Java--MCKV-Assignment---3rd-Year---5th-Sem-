 class MathOperation {
    private int a;
    private int b;
    public MathOperation(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        int c=a;
        int d=b;
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        int sum=(c+d);
        System.out.println("The sum is:"+sum);
    }
    void increase(){
        a+=5;
        b+=5;
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("The increased value of a "+a+" & b is "+b);
    }
}
public class thread2{
    public static void main(String[] args) {
        MathOperation mathops = new MathOperation(10,20);
        Thread addThread = new Thread(()->
            mathops.add());
        Thread increaseThread = new Thread(()->
            mathops.increase());
        addThread.start();
        try{
            addThread.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        increaseThread.start();
        try{
            increaseThread.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        finally{
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
           }
           System.out.println("Both task is completed:");
        }
    }
}

