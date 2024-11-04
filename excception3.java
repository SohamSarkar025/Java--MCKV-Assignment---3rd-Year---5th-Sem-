public class excception3 {
    public static void main(String[] args) {
        String str =  null;
        try{
            int length = str.length();
            System.out.println("The length of the string is"+length);
        }catch(NullPointerException e){
            System.out.println("NullPointerException Occured: "+ e.getMessage());
        }finally{
            System.out.println("Finally block executed "); 
        }
    }
}
