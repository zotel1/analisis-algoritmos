package hilos;

public class ImplementandoRunnable implements Runnable {

    public void run() {
        System.out.println("Desde Runnable: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread hilo = new Thread(new ImplementandoRunnable());
        try {
            hilo.start();
            System.out.println("Estado del hilo después de start(): " + hilo.getState());
            hilo.join();
            System.out.println("Hilo terminado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("El hilo fue interrumpido.");
        }
    }
}
