import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr,int target,int low,int high){
       while(low<=high){
           int mid=(low+high)/2;
        //arr is sorted needed in binary Search
           if(arr[mid]==target){
               return mid;
           } else if (arr[mid]<target) {
               low=mid+1;
           }else {
               high=mid-1;
           }
       }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter arr");
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("enter arr");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter target element ");
        int target=sc.nextInt();

//        int result=binarySearch(arr,target,size-1,0);
        int result = binarySearch(arr, target, 0, size - 1);
        System.out.println(result);

    }
}