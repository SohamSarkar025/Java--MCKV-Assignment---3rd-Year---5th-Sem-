package Searching;

public class binarysearch {
    public int binarysearchmethod(int[] arr,int key,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
