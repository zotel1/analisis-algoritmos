package ejerciciosConBucles;

public class Ejercicio1 {
    
    public void bucleMultiplicacion(int n){
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Valor de i: " + i);
        }
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio = new Ejercicio1();
        int n = 10; // Puedes cambiar este valor para probar con otros números
        System.out.println("Bucle de multiplicación:");
        ejercicio.bucleMultiplicacion(n);
        
        // Comentario sobre la complejidad
        System.out.println("Complejidad: O(log n) debido a que el bucle se ejecuta logarítmicamente en relación a n.");
    }
}
