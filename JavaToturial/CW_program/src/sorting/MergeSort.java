package Sorting;

public class MergeSort {
    
    public static void mergeSort(int[] a, int lr, int up) {
        if (lr >= up) {
            return;
        }
        int mid = (lr + up) / 2;
        mergeSort(a, lr, mid);
        mergeSort(a, mid + 1, up);
        merge(a, lr, mid, up);
    }
    
    public static void merge(int[] a, int lr, int mid, int up) {
        int[] newArr = new int[up - lr + 1];
        int lrInx = lr;
        int upInx = mid + 1;
        int x = 0;
        
        while (lrInx <= mid && upInx <= up) {
            if (a[lrInx] <= a[upInx]) {
                newArr[x++] = a[lrInx++];
            } else {
                newArr[x++] = a[upInx++];
            }
        }
        
        while (lrInx <= mid) {
            newArr[x++] = a[lrInx++];
        }
        
        while (upInx <= up) {
            newArr[x++] = a[upInx++];
        }
        
        System.arraycopy(newArr, 0, a, lr, newArr.length);
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 3, 7, 2};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
