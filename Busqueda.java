public class Busqueda {
    

public static boolean busqueda(int[] arr, int target, int left, int right) {
    if (left > right) 
        return false; // Elemento no encontrado
    int mid = left + (right - left) / 2; // Evita overflow
    if (arr[mid] == target)
        return true; // Elemento encontrado
    if (arr[mid] > target)
        return busqueda(arr, target, left, mid - 1); // Buscar en la mitad izquierda
    else
        return busqueda(arr, target, mid + 1, right); // Buscar en la mitad derecha   
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 5;
    boolean resultado = busqueda(arr, target, 0, arr.length - 1);
    if (resultado) {
        System.out.println("El elemento " + target + " fue encontrado en el arreglo.");
    } else {
        System.out.println("El elemento " + target + " no fue encontrado en el arreglo.");
    }
}
}