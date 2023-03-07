package com.example.calculadoraSpring.console;

import com.example.calculadoraSpring.service.CalculadoraService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
public class ConsoleReader {
    CalculadoraService calculadoraService;

    public ConsoleReader(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostConstruct
    public void init(){
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        int option = 1;
        String entradaConsola;
        while (option != 5){
            System.out.println("Menú por consola");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar ");
            System.out.println("3 - Multiplicar ");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Seleccione operación: ");
            entradaConsola = sc.next();
            try{
                option = Integer.parseInt(entradaConsola);
            }catch (Exception e){
                System.out.println("Opción no válida, ingresa un número para seleccionar operacion");
            }

            switch (option){
                case 5:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    System.out.println("Operación de suma");
                    System.out.println("Ingrese primer número");
                    num1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo número");
                    num2 = Float.parseFloat(sc.next());
                    System.out.println(calculadoraService.suma(num1,num2));
                    break;
                case 2:
                    System.out.println("Operación de resta");
                    System.out.println("Ingrese primer número");
                    num1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo número");
                    num2 = Float.parseFloat(sc.next());
                    System.out.println(calculadoraService.resta(num1, num2));
                    break;
                case 3:
                    System.out.println("Operación de multiplicación");
                    System.out.println("Ingrese primer número");
                    num1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo número");
                    num2 = Float.parseFloat(sc.next());
                    System.out.println(calculadoraService.multiplicacion(num1,num2));
                    break;
                case 4:
                    System.out.println("Operación de división");
                    System.out.println("Ingrese primer número");
                    num1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo número");
                    num2 = Float.parseFloat(sc.next());
                    System.out.println(calculadoraService.division(num1,num2));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
