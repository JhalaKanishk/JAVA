import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAY!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements : ");
        int arr[] = new int[n];

        //input
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Resultant Array : ");
        //output
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
