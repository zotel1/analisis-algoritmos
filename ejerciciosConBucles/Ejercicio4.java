package ejerciciosConBucles;

public class Ejercicio4 {
    public void dosPartesDiferentes(int n){
        // primera parte
        for (int i = 0; i < n; i++) {
            // Operacion O(1)
            System.out.println("Iteración: " + i);
        }

        // Segunda parte
        if (n > 100) {
            for ( int i = 0; i < n * n; i++){
                // Operacion O(1)
                System.out.println("Iteración cuadrática: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
        int n = 10; // Puedes cambiar el valor de n para probar
        ejercicio.dosPartesDiferentes(n);
        System.out.println("Ejercicio completado con n = " + n);
        System.out.println("Complejidad: O(n^2) debido a que la primera parte es O(n) y la segunda parte es O(n^2) cuando n > 100, lo que domina el tiempo de ejecución.");
    }
}
