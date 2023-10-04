package com.example.egercicio11;

public class Operaciones {

   private int numero1,numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Operaciones aritmeticas

    public int suma(){
        return numero1+numero2;
    }

    public int resta(){
        return numero1-numero2;
    }

    public int multiplicacion(){
        return numero1*numero2;
    }

    public int division(){
        return numero1/numero2;
    }
}
