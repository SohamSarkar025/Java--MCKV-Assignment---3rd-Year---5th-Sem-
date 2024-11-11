// Write a java program to overload a function rect()
// void rect (int, char)- With one integer argument and one-character argument draw a filled square of side n using
// character stored in ch.
// void rect(int, int, char) – With two integer argument and one character argument draw a filled rectangle of length
// l and width b using characters stored in ch.


import java.util.Scanner;
 class Drawer{
    public void rect(int n,char ch){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ch+" ");
            }
            System.out.println("");
        }
    }
    public void rect(int l,int w,char ch){
        for(int i=0;i<l;i++){
            for(int j=0;j<w;j++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
}


public class Assg7e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Drawer ob = new Drawer();
        System.out.println("Enter the value of row: ");
        int row = in.nextInt();
        System.out.println("Enter the character: ");
        char squareCh = in.next().charAt(0);
        ob.rect(row,squareCh);

        
        System.out.println("This is method of drawing rectangle");
        System.out.println("Enter the width:");
        int width=in.nextInt();
        System.out.println("Enter the length:");
        int lenght= in.nextInt();
        System.out.println("Enter the character");
        char rectangleCh = in.next().charAt(0);
        ob.rect(width,lenght,rectangleCh);
        in.close();
    }
    
}
