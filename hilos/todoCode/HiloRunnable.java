package hilos.todoCode;

public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hilo ejecutandose con Runnable");
    }


    public static void main(String[] args) {
        HiloRunnable hiloRunnable = new HiloRunnable();
        Thread hilo1 = new Thread(hiloRunnable);
        hilo1.start();

        HiloTodoCode hilo2 = new HiloTodoCode();
        hilo2.start();
        // Medir memoria desde el main
        hilo2.mostrarMemoria("Desde main con Runnable");
        
        //mostrarMemoria("Desde main");

        System.out.println("Hilo principal terminando.");
    }
}
