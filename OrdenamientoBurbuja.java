public class OrdenamientoBurbuja {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
       for (int i = 0; i < n - 1; i++){ // Linea A
        for (int j = 0; j < n - i - 1; j++){ // Linea B
            if (arr[j] > arr[j + 1]){ // Linea C
                // Intercambiar arr[j] y arr[j+1]
                int temp = arr[j]; // Linea D
                arr[j] = arr[j + 1]; // Linea E
                arr[j + 1] = temp; // Linea F
            }
        }
       }
      
       
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
