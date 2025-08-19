package ejerciciosBigONotation;

/*Analiza la complejidad temporal de la búsqueda binaria. */
public class Ejercicio2 {

    public int busquedaBinaria(int[] arr, int target){
        
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; 
        int resultado = ejercicio2.busquedaBinaria(arr, 9);
        System.out.println("El indice es: " + resultado);
        // Salida esperada: El indice es: 8
        // Complejidad: O(log n)
    }
}
