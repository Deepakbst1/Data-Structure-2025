import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    private static void selectionSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}







