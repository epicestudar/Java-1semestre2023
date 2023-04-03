package ProvaCorrecao;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Resolucao {
    Scanner sc =  new Scanner (System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro número:");
        double numeroUm = sc.nextDouble();

        System.out.println("Informe outro número");
        double numeroDois = sc.nextDouble();

        System.out.println("Informe a operação desejada");
        System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão");
        int operacao = sc.nextInt();
        double resultado =sc.nextDouble();

        if(operacao == 1) {
            resultado = numeroUm + numeroDois;
            System.out.println("O resultado é " + resultado);
        } else if(operacao == 2) {
            resultado = numeroUm - numeroDois;
            System.out.println("O resultado é " + resultado);
        } else if(operacao == 3) {
            resultado = numeroUm * numeroDois;
            System.out.println("O resultado é " + resultado);
        } else if(operacao == 4 && numeroDois != 0) {
            resultado = numeroUm / numeroDois;
            System.out.println("O resultado é " + resultado);
        }
        else {
            System.out.println("Operação inválida");
        }
    }
    public void exercicio2() {
        System.out.println("Informe seu n° de matrícula: ");
        int nMatricula = sc.nextInt();
    
        int grupo = nMatricula % 4;
        if(nMatricula == 0) {
            System.out.println("Time do Chris");
        } else if(nMatricula == 1) {
            System.out.println("Time do Greg");
        } else if(nMatricula == 2) {
            System.out.println("Time do Caruso");
        } else {
            System.out.println("Time do Jerome");
        }
    }

    public void exercicio3() {
        System.out.println("Kg de morango");
        double kgMorango = sc.nextDouble();

        System.out.println("Kg de maçã");
        double kgMaca = sc.nextDouble();

        System.out.println("Kg de banana");
        double kgBanana = sc.nextDouble();

        double pesoTotal = kgBanana + kgMaca + kgMorango;
        double valorTotal = kgBanana * 1.8 + kgMaca * 2.3 + kgMorango * 3.5;

        if(pesoTotal >= 15 || valorTotal >= 30) {
            valorTotal = valorTotal - valorTotal * 0.1;
        }
    }
}
