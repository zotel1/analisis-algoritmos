package ejerciciosConBucles;

public class Ejercicio3 {
    public void tresBucles(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    System.out.println("El valor de i es: " + i + ", " + "El valor de j es: " + j + ", " + "El valor de k es: " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();
        ejercicio.tresBucles(10);
        System.out.println("Complejidad: O(n^3) debido a que los tres bucles anidados se ejecutan n veces cada uno, resultando en n * n * n = n^3 iteraciones.");
    }
}
