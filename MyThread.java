// A. Create two threads. One will print from 1 to 10. Another will print 10 to 1. In the second thread if value is 6 it will
// sleep for 10000 milliseconds.

class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        try{
            currentThread().join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=10;i<=1;i--){
            System.out.println(i);
            if(i==6){
                System.out.println("Thread 2 is sleeping");
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
        try{
            currentThread().join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}




public class MyThread{
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        //thread1.start();
        thread2.start();
    }
}
