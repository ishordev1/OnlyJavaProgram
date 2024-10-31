package array;

public class Arraytest {
    public static void findIndices(int[] arr, int target, int[] result) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8};
        int k = 14;
        int[] indices = {0, 0};
        
        findIndices(arr, k, indices);
        
        System.out.println("The answer is: " + indices[0] + " and " + indices[1]);
    }
}
