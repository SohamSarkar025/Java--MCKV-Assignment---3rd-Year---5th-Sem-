import java.util.Scanner;
public class Practicedemo{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you word:");
        String word = in.nextLine();
        System.out.println("Enter the no of times you want to see the word:");
        int num = in.nextInt();
        in.close();
        System.out.println("The Result is:");
        for(int i=1;i<=num;i++){
            System.out.println(word);
        }
    }
}
