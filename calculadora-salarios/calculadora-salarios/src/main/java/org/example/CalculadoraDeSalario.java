package org.example;

public class CalculadoraDeSalario {

    public static double calculaSalario(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        double salarioLiquido = salarioBase;
        Cargo cargoFuncionario = funcionario.getCargo();

        if(cargoFuncionario.equals(Cargo.DESENVOLVEDOR)){
            if (salarioBase >= 3000.0) {
                salarioLiquido -= salarioBase * 0.2;
            } else {
                salarioLiquido -= salarioBase * 0.1;
            }
        }else if(cargoFuncionario.equals(Cargo.DBA) || cargoFuncionario.equals(Cargo.TESTADOR)){
            if (salarioBase >= 2000.0) {
                salarioLiquido -= salarioBase * 0.25;
            } else {
                salarioLiquido -= salarioBase * 0.15;
            }
        }else if (cargoFuncionario.equals(Cargo.GERENTE)){
            if (salarioBase >= 5000.0) {
                salarioLiquido -= salarioBase * 0.3; // desconto de 30%
            } else {
                salarioLiquido -= salarioBase * 0.2; // desconto de 20%
            }
        }
        return salarioLiquido;
    }
}
