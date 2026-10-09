import java.util.*; // Imports all classes in java.util

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        for(int i = 0; i<m;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            arr2[i]= sc.nextInt();
        }

        int i = m -1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
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
        for( i=0;i<m+n;i++){
           System.out.print(arr1[i]+" "); 
        }
        System.out.println(" ");
        // median 

        
        int median = (m+n)/2;
        System.out.println(arr1[median]);

        

    }
}
