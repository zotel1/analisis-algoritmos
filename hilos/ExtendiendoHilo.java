package hilos;

public class ExtendiendoHilo extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ExtendiendoHilo hilo1 = new ExtendiendoHilo();
        ExtendiendoHilo hilo2 = new ExtendiendoHilo();
        
        hilo1.start();
        System.out.println("Estado del hilo1 después de start(): " + hilo1.getState());
        hilo2.start();
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
