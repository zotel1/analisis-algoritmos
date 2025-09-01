 package hilos.todoCode;

public class HiloTodoCode extends Thread {
    public void run() {
        System.out.println("Hilo ejecutandose con Threds");
    }

    public static void main(String[] args) {
        HiloTodoCode hiloTodoCode = new HiloTodoCode();
        hiloTodoCode.start();

        // Medir memoria desde el main
        hiloTodoCode.mostrarMemoria("Desde main");

        System.out.println("Hilo principal terminando.");
    }

    public void mostrarMemoria(String contexto) {
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
}

    