import java.util.Random;

public class LomutoQuickSort {

    public static void main(String[] args) {
        int n = 50;
        int[] A = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100);
        }
        System.out.println("Przed QuickSortem: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        lomutoQuickSort(A, 0, A.length-1);
        System.out.println("\nPo QuickSorcie: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void lomutoQuickSort(int[] A, int low, int high) {
        if (low < high) {
            int pivotIndex = lomutoPartition(A, low, high);
            lomutoQuickSort(A, low, pivotIndex-1);
            lomutoQuickSort(A, pivotIndex+1, high);
        }
    }

    public static int lomutoPartition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j <= high-1; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i+1, high);
        return i+1;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
