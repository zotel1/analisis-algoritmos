package ejerciciosBigONotation;
/*Analiza la complejidad temporal de este algoritmo, que imprime la mitad de los elementos de un arreglo.*/

public class Ejercicio1 {
    public void imprimirMitad(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio = new Ejercicio1();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}; 
        ejercicio.imprimirMitad(arr);
        // Salida esperada: 1, 2, 3, 4, 5, 6 , 7, 8
        // Complejidad: O(n/2) = O(n)
    }
}
