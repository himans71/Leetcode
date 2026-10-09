public class Main {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for result

        // Compare elements from both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = mergeArrays(arr1, arr2);

        System.out.println("Merged Array:");

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}