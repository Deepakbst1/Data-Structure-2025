import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        sc.close();
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {


                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
