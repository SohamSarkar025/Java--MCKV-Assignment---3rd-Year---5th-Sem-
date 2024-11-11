public class fibo{
    public static void main(String[] args) {
        int n=10,firstnum=0,secondnum=1;
        int thirdnum;
        for(int i=1;i<=n;i++){
            System.out.print(firstnum+", ");
            thirdnum=(firstnum+secondnum);
            firstnum=secondnum;
            secondnum=thirdnum;
        }
    }
}
