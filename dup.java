import java.util.*;
public class dup{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i =0; i < arr.length ; i++){

            arr[i] = sc.nextInt();

        }

        for(int i =0 ; i< arr.length ;i++){
            if(arr[i]==arr[i+1]){
                continue;
                
            }
        }

        for(int i =0; i<arr.length;i++){
            System.out.print(arr);
        }

    }
}