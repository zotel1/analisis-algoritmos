package hilos.todoCode;

public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hilo ejecutandose con Runnable");
    }

    private static void mostrarMemoria(String contexto) {
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory();
        long free = runtime.freeMemory();
        long used = total - free;

        System.out.println("[" + contexto + "]");
        System.out.println("Total: " + (total / 1024 / 1024) + " MB");
        System.out.println("Libre: " + (free / 1024 / 1024) + " MB");
        System.out.println("Usada: " + (used / 1024 / 1024) + " MB");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        HiloRunnable hiloRunnable = new HiloRunnable();
        Thread hilo1 = new Thread(hiloRunnable);
        hilo1.start();

        HiloTodoCode hilo2 = new HiloTodoCode();
        hilo2.start();

        // Medir memoria desde el main
        mostrarMemoria("Desde main");

        System.out.println("Hilo principal terminando.");
    }
}
