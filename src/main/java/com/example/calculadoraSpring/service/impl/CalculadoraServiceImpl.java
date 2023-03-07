package com.example.calculadoraSpring.service.impl;

import com.example.calculadoraSpring.service.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {
    @Override
    public float suma(float n1, float n2) {
        return n1+n2;
    }

    @Override
    public float resta(float n1, float n2) {
        return n1-n2;
    }

    @Override
    public float division(float n1, float n2) {
        return n1/n2;
    }

    @Override
    public float multiplicacion(float n1, float n2) {
        return n1*n2;
    }
}
