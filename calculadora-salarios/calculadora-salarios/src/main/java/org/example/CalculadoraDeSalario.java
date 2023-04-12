package org.example;

public class CalculadoraDeSalario {

    public static double calculaSalario(Funcionario funcionario) {
        double desconto = calculaDesconto(funcionario.getCargo(), funcionario.getSalarioBase());
        return funcionario.getSalarioBase() - desconto;
    }

    private static double calculaDesconto(Cargo cargo, double salarioBase){
        double desconto;
        if(cargo.equals(Cargo.DESENVOLVEDOR)){
            desconto = salarioBase >= 3000.0 ?  salarioBase * 0.2 :  salarioBase * 0.1;
        }else if(cargo.equals(Cargo.DBA) || cargo.equals(Cargo.TESTADOR)){
            desconto = salarioBase >= 2000.0 ?  salarioBase * 0.25 :  salarioBase * 0.15;
        }else if (cargo.equals(Cargo.GERENTE)){
            desconto = salarioBase >= 5000.0 ?  salarioBase * 0.3 :  salarioBase * 0.2;
        }else{
            desconto = 0.0;
        }

        return desconto;
    }
}
