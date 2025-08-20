package ejerciciosBigONotation;

public class Ejercicio4 {
    public void dosOperaciones(int n){
        // Primera parte
        for (int i = 0; i < n; i++){
            System.out.println("Parte 1");
        }
        // Segunda parte
        for (int i = 0; i < n * n; i++){
            System.out.println("Parte 2");
    }
}

public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int n = 3;
        ejercicio4.dosOperaciones(n); 
        // Salida esperada: "Parte 1" se imprime 3 veces, "Parte 2" se imprime 9 veces
        // Complejidad: O(n) + O(n^2) = O(n^2)
}

}
