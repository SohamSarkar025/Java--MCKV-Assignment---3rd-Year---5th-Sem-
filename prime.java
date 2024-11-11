public class prime {
    public static void main(String[] args) {
        int lower =1;
        int upper=10;
        for(int i=lower;i<=upper;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
                else{
                    System.out.println(i+", ");
                }
            }

        }
    }
}
