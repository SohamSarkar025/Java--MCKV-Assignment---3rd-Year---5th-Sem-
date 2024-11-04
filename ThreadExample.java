public class ThreadExample {

    public static void main(String[] args) {
        // Thread to print numbers from 1 to 10
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500); // Sleep for half a second between prints
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted: " + e.getMessage());
                }
            }
        });

        // Thread to print numbers from 10 to 1
        Thread thread2 = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                if (i == 6) {
                    try {
                        System.out.println("Thread 2 sleeping for 10 seconds at value: " + i);
                        Thread.sleep(10000); // Sleep for 10 seconds when i is 6
                    } catch (InterruptedException e) {
                        System.out.println("Thread 2 interrupted: " + e.getMessage());
                    }
                }
                try {
                    Thread.sleep(500); // Sleep for half a second between prints
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted: " + e.getMessage());
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Both threads have finished execution.");
    }
}

