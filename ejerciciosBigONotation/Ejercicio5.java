package ejerciciosBigONotation;

public class Ejercicio5 {
    public int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int n = 9;
        int resultado = ejercicio5.fibonacci(n);
        System.out.println("Fibonacci de " + n + " es: " + resultado);
        
        // Complejidad: O(2^n) debido a la recursión exponencial
    }
}
