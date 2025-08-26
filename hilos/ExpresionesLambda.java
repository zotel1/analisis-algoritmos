package hilos;

public class ExpresionesLambda {
    

    public static void main(String[] args) {
        new Thread(() -> {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }).start();
    System.out.println("Estado del hilo después de start(): " + Thread.currentThread().getState());
    System.out.println("Hilo principal terminado.");
    }
}
