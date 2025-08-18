public class EjemploDos {
    
    public static void misterio2(int n){
        for(int i = 1; i< n; i  *= 2){ // Paso 1: ¿Cuantas veces?
            for(int j = 0; j< i; j++){ // Paso 2: ¿Cuantas veces?
                System.out.println(j); // Paso 3: ¿Que complejidad?
            }
        }
    }
    
    public static void main(String[] args) {
        misterio2(16);
    }
}
