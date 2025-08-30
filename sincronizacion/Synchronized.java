package sincronizacion;

public class Synchronized {
    public synchronized void metodoSeguro() {
        System.out.println("Método sincronizado en ejecución: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simula trabajo
        } catch (InterruptedException e) {
            e.printStackTrace();
}
    }

    public static void main(String[] args) {
        Synchronized obj = new Synchronized();

        Thread hilo1 = new Thread(() -> obj.metodoSeguro());
        Thread hilo2 = new Thread(() -> obj.metodoSeguro());

        hilo1.start();
        System.out.println("Estado del hilo1 después de start(): " + hilo1.getState());
        System.out.println(hilo1);
        hilo2.start();
        System.out.println(hilo2);
        System.out.println("Estado del hilo2 después de start(): " + hilo2.getState());

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hilos terminados.");
    }
}

