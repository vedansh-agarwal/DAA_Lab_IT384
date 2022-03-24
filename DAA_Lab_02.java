import java.util.*;
public class DAA_Lab_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 1; i < n; i++)
            for(int j = i; j > 0; j--)
                if(arr[j] < arr[j-1])
                    swap(arr, j);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    public static void swap(int arr[], int x) {
        int temp = arr[x];
        arr[x] = arr[x-1];
        arr[x-1] = temp;
    }
}