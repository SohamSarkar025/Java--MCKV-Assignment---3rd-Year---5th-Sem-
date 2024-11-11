
import java.util.Scanner;

class Number{
    protected int num;
    public Number(int num){
        this.num= num;
    }

    void displayNum(){
        return ;
    }
}
class HexNum extends Number{
    public HexNum(int num){
        super(num);
    }

    void displayNum(){
        System.out.println("Hexdecimal: "+Integer.toHexString(num).toUpperCase());
    }
}
class OctNum extends Number{
    public OctNum(int num){
        super(num);
    }

    void displayNum(){
        System.out.println("Hexdecimal: "+Integer.toOctalString(num));
    }
}
public class Assg8b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();
        Number Hexnumber = new HexNum(num);
        Number Octalnumer = new OctNum(num);

        Hexnumber.displayNum();
        Octalnumer.displayNum();
    }
    
}
