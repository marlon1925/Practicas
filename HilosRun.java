public class HilosRun implements Runnable {
    private int tipo; // Un campo para indicar el tipo de hilo (1 o 2)

    public HilosRun(int tipo) {
        this.tipo = tipo; // Constructor que recibe el tipo de hilo
    }

    @Override
    public void run() {
        // Este método se ejecutará cuando se inicie el hilo
        // Dependiendo del tipo, el hilo realizará diferentes tareas.
        switch(tipo) {
            case 1: {
                for(int i = 1; i < 30; i++) {
                    System.out.println(i); // Imprimir números del 1 al 29
                }
            }
            case 2: {
                
                 for(char k = 'a'; k < 'z'; k++) {
                    System.out.println(k); // Imprimir números del 1 al 29
                }
            }
        }
    }
}
