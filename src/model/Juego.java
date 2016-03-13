package model;

public class Juego {

    private NumeroSecreto numeroSecreto;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealisados;
    int intentosRestantes;

    public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
    }

    public Juego(int limiteInferior, int limiteSuperior, int intentos) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.numeroDeIntentos = intentos;
        this.numeroSecreto = new NumeroSecreto(this.limiteInferior, this.limiteSuperior);
        this.intentosRealisados = 0;
    }

    public void setNumeroIntentos(int intentos) {
        this.numeroDeIntentos = intentos;
    }

    public boolean esElNumeroSecreto(int numero) {
        this.intentosRealisados++;
        return numeroSecreto.esIgual(numero);
    }

    public boolean puedeIntentarDeNuevo() {
        boolean hayMasOportunidades = this.intentosRestantes() > 0;
        return hayMasOportunidades;
    }

    public int intentosRestantes() {
        int numeroDeIntentosRestantes = this.intentosRestantes - this.intentosRealisados;
        return (numeroDeIntentosRestantes);
    }

    public String getTexoDeAyuda(int numero) {
        String texto = null;
        if (this.numeroSecreto.esMayor(numero) == true) {
            texto = "mayor";
        } else if (this.numeroSecreto.esMenor(numero) == true) {
            texto = "Menor";
        }
        return texto;
    }

    public String getNumeroSecreto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}