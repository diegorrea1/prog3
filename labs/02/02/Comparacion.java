import java.util.Arrays;

public class Comparacion {
    
    public static void main(String[] args) {
        int[] tamañoarr = {100, 500, 1000, 5000, 10000};
        
        System.out.println("Tamaño del Arreglo  Burbuja  Inserción  Selección  Mergesort");
        
        for (int size : tamañoarr) {
            double[] randomArray = generaRandomArr(size);
            double[] bubbleSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long bubbleSortStartTime = System.nanoTime();
            long bubbleSortEndTime = System.nanoTime();
            long bubbleSortTime = bubbleSortEndTime - bubbleSortStartTime;
            double[] insertionSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long insertionSortStartTime = System.nanoTime();
            long insertionSortEndTime = System.nanoTime();
            long insertionSortTime = insertionSortEndTime - insertionSortStartTime;
            double[] selectionSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long selectionSortStartTime = System.nanoTime();
            long selectionSortEndTime = System.nanoTime();
            long selectionSortTime = selectionSortEndTime - selectionSortStartTime;
            double[] mergeSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long mergeSortStartTime = System.nanoTime();
            long mergeSortEndTime = System.nanoTime();
            long mergeSortTime = mergeSortEndTime - mergeSortStartTime;
            
            System.out.printf("%-18d  %-7d  %-10d  %-9d  %-8d%n", size, bubbleSortTime, insertionSortTime, selectionSortTime, mergeSortTime);
        }
    }
    public static double[] generaRandomArr(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;}
            }n--;
        } while (swapped);
    }
    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void mergeSort(double[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            double[] left = Arrays.copyOfRange(arr, 0, mid);
            double[] right = Arrays.copyOfRange(arr, mid, n);
            mergeSort(left);
            mergeSort(right);
            int i = 0, j = 0, k = 0;
            
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }
            while (i < left.length) {
                arr[k++] = left[i++];
            }
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }
}
