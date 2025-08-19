package ejerciciosBigONotation;

/*Bucles anidados con diferente rango
 * 
 *Analiza la complejidad temporal de este algoritmo, con bucles anidados de diferentes rangos.
 */

public class Ejercicio3 {
    public void buclesAnidadosDiferentes(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("Operación " + (i + 1) + ", " + (j + 1));
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int n = 3;
        ejercicio3.buclesAnidadosDiferentes(n); 
        // Salida esperada: "Operación" se imprime 60 veces
        // Complejidad: O(n * 10) = O(n)
    }
}
