public class EjemploUno {
    public static void misterio1(int n){
        for (int i = 0; i < n; i++){ // ¿Cuantas veces?
            for (int j = 1; j < n; j *= 2){ // ¿Cuantas veces?
                System.out.println(i + j); // Que complejidad?
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        misterio1(n);
    }
}
