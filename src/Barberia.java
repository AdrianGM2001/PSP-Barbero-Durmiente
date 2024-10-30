public class Barberia {
    private enum ESTADO{DORMIDO,OCUPADO}
    private ESTADO estado;
    private int numeroSillas;
   
    public Barberia(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    } 
}
