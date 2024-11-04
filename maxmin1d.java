import java.util.Scanner;
public class maxmin1d {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.print("The maximum elementsin the array:");
        System.out.println(max(arr));
        System.out.print("The minimum elementsin the array:");
        System.out.println(min(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
    static int min(int[] arr){
    int min = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
       }
    }
    return min;
    }
}
