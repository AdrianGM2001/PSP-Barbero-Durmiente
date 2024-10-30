public class Cliente implements Runnable {
    private String nombre;
    private Barberia barberia;;

    public Cliente(String nombre, Barberia barberia) {
        this.nombre = nombre;
        this.barberia = barberia;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            barberia.sentar(nombre);
            wait();
            barberia.cortar();
            Thread.sleep(3000);
        }
    }
}
