import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int target,int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
        System.out.println("enter the target");
        int target=sc.nextInt();

        System.out.println("enter the arr value");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int result=linearSearch(target,arr);

        System.out.println("found at index"+result);

    }
}