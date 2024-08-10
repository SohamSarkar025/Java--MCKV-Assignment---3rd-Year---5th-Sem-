



//Write three separate java programs to generate the following patterns: 


// *    
// * *             
// * * *    
// * * * *    
// * * * * *
 


//import java.util.Scanner;
public class Assg5a {
    public static void main(String[] args){
        int row=5,j;
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the no of row:");
        //row = in.nextInt();
        //in.close();
        for(int i=1;i<=row;i++){
            for( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
