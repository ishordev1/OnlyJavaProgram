package Sorting;

public class QuickSort {
    static void swap(int[] a, int lr, int up) {
        int temp = a[lr];
        a[lr] = a[up];
        a[up] = temp;
    }

    static void quicksort(int[] a, int lr, int up) {
        if (lr >= up) {
            return;
        }
        int pi = partition(a, lr, up);
        quicksort(a, lr, pi - 1);
        quicksort(a, pi + 1, up);
    }

    static int partition(int[] a, int lr, int up) {
        // First element is pivot.
        int pivot = a[lr];
        int count = 0;
        
        // Count all elements smaller than or equal to the pivot.
        for (int i = lr + 1; i <= up; i++) {
            if (a[i] <= pivot) // Remove semicolon here - it terminates the if statement prematurely.
                count++;
        }
        
        // Calculate the exact position where the pivot should be placed.
        int pvtIdx = lr + count;
        swap(a, lr, pvtIdx);
        
        // Initialize indices for the partition process.
        int i = lr, j = up;
        
        // Continue partitioning until indices meet.
        while (i < pvtIdx && j > pvtIdx) {
            // Find element on left side greater than pivot.
            while (a[i] <= pivot) // Corrected condition: should find elements greater than pivot.
                i++;
            // Find element on right side smaller than or equal to pivot.
            while (a[j] > pivot) // Corrected condition: should find elements smaller than or equal to pivot.
                j--;
            // Swap elements if they are in the wrong partitions.
            if (i < pvtIdx && j > pvtIdx) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        return pvtIdx; // Return the pivot index.
    }

    static void display(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 9, 3, 8, 1, 2, 7 };
        QuickSort.display(a);
        QuickSort.quicksort(a, 0, a.length - 1);
        QuickSort.display(a);
    }
}
