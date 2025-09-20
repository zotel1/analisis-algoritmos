package ejercicios_semana_3_4;

public class HiloContador implements Runnable {

    
    
    private Contador contador;
    private final int iteraciones;

    public HiloContador(Contador contador, int iteraciones){
        this.contador = contador;
        this.iteraciones = iteraciones;
    }

    @Override
    public void run(){
        for (int i = 0; i < iteraciones; i++){
            contador.incrementar();
        }
    }

    public static void main(String[] args) {

 

        Contador contador = new Contador();
        final int numHilos = 10;
        final int iteracionesPorHilo = 10000000;

        Thread[] hilos = new Thread[numHilos];
        for (int i = 0; i < numHilos; i++) {
            hilos[i] = new Thread(new HiloContador(contador, iteracionesPorHilo));
            hilos[i].start();
        }

        for (int i = 0; i < numHilos; i++){
            hilos[i].join(); // Esperar a que los hilos terminen
        }
        System.out.println("Valor esperado: " + (numHilos * iteracionesPorHilo));
        System.out.println("Valor final del contador:" + contador.getValor());
    }

           class Contador {
    private int valor = 0;

    public void incrementar() {
        // TODO: Implementa aqui el mecanismo de sincronizacion
        valor++;
    }

    public int getValor() {
        return valor;
    }
}
}

