package com.edu.fatec.exc001;

public class CalculadoraImpl implements Calculadora{

    @Override 
    public String calcular(double num1, double num2, double num3){
        
        if(num1 <= 0.0 || num2 <= 0.0 || num3 <= 0 
            || (num1 + num2 <= num3 ) || (num1 + num3 <= num2) || (num3 + num2 <= num1)){
                return "Não é um triângulo formado";
            }

        if(num1 == num2 && num2 == num3){
            return "Equilátero";
        } else if (num1 == num2 || num2 == num3 || num1 == num3 ){
            return "Isósceles";
        } else {
            return "Escaleno";
        }

    }
}
