package ExerciciosIfElse;

import java.util.Scanner;

public class ExerciciosPT2 {
    Scanner sc = new Scanner(System.in);

    public void exercicio11(){
        System.out.println("Informe o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Informe quantas horas você trabalhou no mês: ");
        double horasTrabalhadas = sc.nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        if(salarioBruto<=900) {
            System.out.println("Você está isento e não terá reajustes no salário");
        }
           
            else if(salarioBruto>900 && salarioBruto<=1500) {
                double impostoRenda = (salarioBruto * 5) / 100;
                double inS = (salarioBruto * 10) / 100;
                double fGt = (salarioBruto * 11) / 100;
                double totalDescontos = impostoRenda + inS + fGt;
                double salarioLiquido = salarioBruto - totalDescontos;
                System.out.println("Salário bruto: " + salarioBruto);
                System.out.println("Desconto IR: " + impostoRenda);
                System.out.println("Desconto INSS: " + inS);
                System.out.println("Desconto FGTS: " + fGt);
                System.out.println("Total de descontos: " + totalDescontos);
                System.out.println("Seu salário líquido é: " + salarioLiquido);
}
           else if(salarioBruto>1500 && salarioBruto <=2500) {
            double impostoRenda = (salarioBruto * 10) / 100;
            double inS = (salarioBruto * 10) / 100;
            double fGt = (salarioBruto * 11) / 100;
            double totalDescontos = impostoRenda + inS + fGt;
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Desconto IR: " + impostoRenda);
            System.out.println("Desconto INSS: " + inS);
            System.out.println("Desconto FGTS: " + fGt);
            System.out.println("Total de descontos: " + totalDescontos);
            System.out.println("Seu salário líquido é: " + salarioLiquido);
}
else if(salarioBruto>2500) {
    double impostoRenda = (salarioBruto * 20) / 100;
    double inS = (salarioBruto * 10) / 100;
    double fGt = (salarioBruto * 11) / 100;
    double totalDescontos = impostoRenda + inS + fGt;
    double salarioLiquido = salarioBruto - totalDescontos;
    System.out.println("Salário bruto: " + salarioBruto);
    System.out.println("Desconto IR: " + impostoRenda);
    System.out.println("Desconto INSS: " + inS);
    System.out.println("Desconto FGTS: " + fGt);
    System.out.println("Total de descontos: " + totalDescontos);
    System.out.println("Seu salário líquido é: " + salarioLiquido);
}
           }

}

