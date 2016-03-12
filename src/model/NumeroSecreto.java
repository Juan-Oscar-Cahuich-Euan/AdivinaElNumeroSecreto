package model;

import java.util.Random;

public class NumeroSecreto {

    private int Numero;
    private int limiteInferior;
    private int limiteSuperior;
    private Random generador;
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;

    public void setRango(int limiteInferior, int limiteSuperior) {

        if (limiteInferior > limiteSuperior) {
            this.limiteInferior = LIM_INF_PREDET;
            this.limiteSuperior = LIM_SUP_PREDET;
        } else {
            this.limiteInferior = limiteInferior;
            this.limiteInferior = limiteSuperior;
        }
    }

    public final void generar() {
        this.Numero = generador.nextInt(limiteSuperior) + 1;
    }

    public NumeroSecreto(int limiteSuperior, int limiteInferior) {
        this.setRango(limiteInferior, limiteSuperior);
        this.generador = new Random();
        this.generar();
    }
public NumeroSecreto(){
this(LIM_INF_PREDET,LIM_SUP_PREDET);
}
public int getNumeroSecreto(){
return this.Numero;
}
public int getlimiteInferior(){
return this.limiteInferior;
}
public int getlimiteSuperior(){
return this.limiteSuperior;
}
public boolean esMayor(int Numero){
boolean elNumeroSecretoEsMayor; if
(this.Numero > Numero){
   elNumeroSecretoEsMayor = true; }
else{
    elNumeroSecretoEsMayor = false;
}
return elNumeroSecretoEsMayor;
}

public boolean esIgual(int Numero){
return(this.Numero== Numero);
}

}
