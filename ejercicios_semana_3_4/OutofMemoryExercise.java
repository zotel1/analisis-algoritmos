package ejercicios_semana_3_4;

import java.util.ArrayList;
import java.util.List;

//Vamos a llenar el Heap

public class OutofMemoryExercise {

    // Clase simple para crear objetos
    public static class LargeObject{
        private byte[] data = new byte[1024 * 1024]; // 1 MB
    }

    public static void main(String[] args) {
        System.out.println("Intentando provocar un OutOfMemoryError...");

        List<LargeObject> list = new ArrayList<>();
        try {
            while (true) {
                // Todo: Descomenta la siguiente linea para provocar el error.
                
                //list.add(new LargeObject());
                // Si la ejecutas, el ]GC no podra liberar memoria a tiempo
            }
        } catch(OutOfMemoryError e){
            System.out.println("¡Se ha producido un OutOfMemoryError!");
            e.printStackTrace();
        }
        System.out.println("Programa terminado.");

    }
    
}
