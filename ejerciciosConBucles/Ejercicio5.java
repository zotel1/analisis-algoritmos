package ejerciciosConBucles;

public class Ejercicio5 {
    public int sumaRecursiva(int n){
        if (n <= 0){
            return 0;
        }
        return n + sumaRecursiva(n - 1);
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio = new Ejercicio5();
        int n = 10; // Puedes cambiar el valor de n para probar
        int resultado = ejercicio.sumaRecursiva(n);
        System.out.println("La suma de los primeros " + n + " números es: " + resultado);
        System.out.println("Complejidad: O(n) debido a que la función se llama recursivamente n veces, sumando cada número hasta llegar a 0.");
    }
}
