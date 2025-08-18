public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {
        int numero = 1;
        int resultado = fibonacci(numero);
        System.out.println("El número de Fibonacci en la posición " + numero + " es: " + resultado);
    
}
}
