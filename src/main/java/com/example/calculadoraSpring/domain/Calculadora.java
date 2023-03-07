package com.example.calculadoraSpring.domain;

import org.springframework.stereotype.Component;

public class Calculadora {

    private float numero1;
    private float numero2;

    public Calculadora() {
    }

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
}
