public class Barberia {
    private boolean ocupado;
    private int numeroSillasTotales;
    private int numeroSillasLibres;
    private int numeroSillasOcupadas;
   
    public void sentar(){
        
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public int getNumeroSillasTotales() {
        return numeroSillasTotales;
    }

    public int getNumeroSillasLibres() {
        return numeroSillasLibres;
    }

    public int getNumeroSillasOcupadas() {
        return numeroSillasOcupadas;
    }

    public Barberia(int nSillas) {
        this.numeroSillasTotales = nSillas;
    } 
}
