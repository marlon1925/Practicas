public class Clase2Runnable {

    public static void main(String[] args) {
        System.out.println("PRINCIPAL");
        // Creación de instancias de HilosRun para los hilos h1 y h2
        HilosRun h1 = new HilosRun(1);
        HilosRun h2 = new HilosRun(2);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
        // Iniciar la ejecución de los hilos t1 y t2
        
    }
}
