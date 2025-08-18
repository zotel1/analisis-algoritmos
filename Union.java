public class Union {

    public static void merge(int[] arr, int left, int mid, int right) {
        // Tamaños de los subarreglos
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Subarreglos temporales
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copiando datos a los subarreglos temporales
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

            // Inmdices iniciales de los subarreglos y el arreglo principal
        int i = 0, j = 0;
        int k = left;

        // Merge: comparar y ordenar
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L[] si hay
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R[] si hay
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

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
