import java.util.Scanner;

public class Merge {

    public static void mergeArrays(int[] arr1, int m, int[] arr2, int n) {

        int i = m-1 ;
        int j = n-1 ;
        int k = m+n-1;

        while(i>=0 && j>=0 ){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;

        }
        while(j>=0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }           

        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();

        // arr1 has extra space for arr2
        int[] arr1 = new int[m + n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(" ");

        mergeArrays(arr1, m, arr2, n);

        System.out.println("Merged Array:");

        for (int x : arr1) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}