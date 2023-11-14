//Proceso Principal

import java.util.logging.Logger;

public class EjemploHilo {

    public static void main(String[] args) {
        
        // Crear una instancia del hilo1 e hilo 2
        Hilos hilo1 = new Hilos(1);
        Hilos hilo2 = new Hilos(2);

        // Iniciar la ejecución de los hilos
        hilo1.start();
        
        try {
            hilo1.join(); // Esperar a que hilo1 termine
        } catch (InterruptedException exception) {
            Logger.getLogger(null);
        }

        hilo2.start();
        
        // Programa principal
        System.out.println("programa principal");

    }
    
}
