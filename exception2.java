public class exception2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try{
            arr[15]=5;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The origin:"+e.getMessage());
            
        }
        catch(Exception e){
            System.out.println("Exception caught:"+e.getMessage());
        }
        
    }
}
