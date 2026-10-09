import java.util.Scanner;

public class sLargest {
    public static int secondLar(int[] arr){
        int lar= arr[0];
        int slar= -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                slar= lar;
                lar=arr[i];
            }
            else if(arr[i]<lar && arr[i]>slar){
                slar = arr[i];
            }
        }
        return slar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondLar(arr))  ;  
    }

}
