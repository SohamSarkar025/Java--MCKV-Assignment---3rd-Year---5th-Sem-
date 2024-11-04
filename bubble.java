import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        bubblesort(arr);
        System.out.print(Arrays.toString(arr));
        

    }
    static void bubblesort(int[] arr){
        int count=0;
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                    count++;
                }
            }
            if(swapped==false){
               //System.out.println("The array is already sorted");
               break;
            }
        }
        System.out.println("Total comparison = "+count);
    }
}
