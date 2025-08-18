public class Union {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // O(1)
            mergeSort(arr, left, mid); // T(n/2)
            mergeSort(arr, mid + 1, right); // T(n/2)
            merge(arr, left, mid, right); // O(n)
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
