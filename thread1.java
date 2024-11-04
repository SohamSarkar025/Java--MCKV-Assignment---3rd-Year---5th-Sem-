public class thread1 {
    public static void main(String[] args) {
    Thread threadt1 = new Thread(()-> {
           for(int i=1;i<=10;i++){
            System.out.println(i);
           try{
                 Thread.sleep(500);
            }catch(InterruptedException e){
                 System.out.println("Thread 1 Interrupted"+e.getMessage());
            }
        }
    });
    Thread threadt2 = new Thread(()-> {
            for(int i=10;i>=1;i--){
                System.out.println(i);
            if(i==6){
                try{
                    System.out.println("Thread 2 sleeping for 10 seconds at value: " + i);
                    Thread.sleep(10000);
                }catch(InterruptedException e){
                    System.out.println("Thread 2 interrupted"+e.getMessage());
                }
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread 1 Interrupted"+e.getMessage());
            }
        }  
    });
    threadt1.start();
    threadt2.start();
    try{
        threadt1.join();
        threadt2.join();
    }catch(InterruptedException e){
        System.out.println("MainMethod interrupted");
    }
}
}



