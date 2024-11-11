import java.util.Scanner;

public class testjava2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to Print Patttern 1\nEnter 2 to Print Pattern2\nEnter 3 to Print Pattern 4\nEnter 4 to Exit");
        lp:while(true){
            System.out.print("Enter Your Choice:");
            int choice = in.nextInt();
            switch(choice){
                case 1:System.out.println("This is Pattern 1");
                System.out.print("Enter the no of row:");
                int n = in.nextInt();
                for(int i=1;i<n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
                case 2:System.out.println("This is Pattern 2");
                System.out.print("Enter the no of row:");
                int n1 = in.nextInt();
                for(int i=1;i<=n1;i++){
                    for(int j=1;j<=n1-i;j++){
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++){
                        System.out.print(k+" ");
                    }
                    System.out.println();
                }
                break;
                case 3:
                System.out.println("This is Pattern 3");
                System.out.print("Enter the no of row: ");
                int n2 = in.nextInt();
                char ch ='A';
                for(int i=0;i < n2;i++){
                    for(int j=n2;j>i;j--){
                        System.out.print(" ");
                    }
                    for(int k=0;k<=i;k++){
                        System.out.print(ch+" ");
                        ch++;
                    }
                    System.out.println();
                }
                break;
                case 4:
                System.out.println("Exitting.....");
                break lp;
                default:
                System.out.println("Invalid Choice....");
            }
        }
    in.close();
    }   
}
