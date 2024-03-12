import java.util.*;
/**
 * Q1. Return Sum of Maximum and Minimum Element in an Array
 * Input: arr[] = {3, 5, 4, 1, 9}
 * Output: Minimum element is: 1
 *         Maximum element is: 9
 *
 *         sum of these elements : 1 + 9 = 10 ans
 * */

public class A1 {
    public static int findSum(int A[],int N)//Array, Size
    {
        //code here
        int Sum = 0;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        //Maximum & Minimum
        for(int i=0; i<=N-1; i++){
            //Finding Maximum
            if(A[i] > Max){
                Max = A[i];
            }
            //Finding Minimum
            if(A[i] < Min){
                Min = A[i];
            }
        }
        Sum = Max + Min;
        return Sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int arr[] = new int[n];
        //input
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array : ");
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of Maximum & Minimum is : "+findSum(arr, n));
    }
}
