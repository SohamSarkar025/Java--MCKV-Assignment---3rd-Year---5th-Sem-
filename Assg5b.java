

//Write three separate java programs to generate the following patterns: 








import java.util.Scanner;
public class Assg5b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row = in.nextInt();
        in.close();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
    
}
