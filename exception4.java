 class MathException extends Exception{
    public MathException(String message){
        super(message);
    }
    class OverflowException extends MathException{
        public OverflowException(String message){
            super(message);
        }
    }
    class UnderflowException extends MathException{
        public UnderflowException(String message){
            super(message);
        }
    }
}
public class exception4 {
    public static void main(String[] args) {
        int value=150;
        try{
            if(value>100){
                throw new OverflowException("Overflow Exception:");
            }
            else{
                throw new UnderflowException("Underflow Exception");
            }
        }
        catch(OverflowException e){
            System.out.println("Caught OverflowException"+e.getMessage());
        }
        catch(UnderflowException e){
            System.out.println("Caught UnderflowException"+e.getMessage());
        }catch(MathException e){
            System.out.println("Exception caught:");
        }
    }
    
}
