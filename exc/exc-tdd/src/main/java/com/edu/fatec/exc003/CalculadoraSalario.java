package com.edu.fatec.exc003;

public class CalculadoraSalario {
    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();

        switch (cargo) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000.0) {
                    return salarioBase * 0.80; // Desconto de 20%
                } else {
                    return salarioBase * 0.90; // Desconto de 10%
                }

            case DBA:
            case TESTADOR:
                if (salarioBase >= 2000.0) {
                    return salarioBase * 0.75; // Desconto de 25%
                } else {
                    return salarioBase * 0.85; // Desconto de 15%
                }

            case GERENTE:
                if (salarioBase >= 5000.0) {
                    return salarioBase * 0.70; // Desconto de 30%
                } else {
                    return salarioBase * 0.80; // Desconto de 20%
                }

            default:
                throw new IllegalArgumentException("Cargo desconhecido");
            }
        }
}
