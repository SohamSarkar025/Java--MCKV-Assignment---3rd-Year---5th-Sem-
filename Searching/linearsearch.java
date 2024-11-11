package Searching;

public class linearsearch {
    public void linearsearchmethod(int[] arr,int key){
         for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
               System.out.println("Element found at index: "+ i);
               break;
            }
            if(i==arr.length){
                System.out.println("Element not found for value "+key);
            }
        }
    }
}
