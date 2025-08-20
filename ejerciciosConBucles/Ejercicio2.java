package ejerciciosConBucles;

public class Ejercicio2 {
    public void bucleAnidadoCombinado(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j = j * 2){
                System.out.println("El valor de i es: " + i + ", " +"El valor de j es: "+ + j);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.bucleAnidadoCombinado(10);
        System.out.println("Complejidad: O(n log n) debido a que el bucle externo se ejecuta n veces y el bucle interno logarítmicamente en relación a n");
    }
}
