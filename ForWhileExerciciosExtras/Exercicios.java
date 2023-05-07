package ForWhileExerciciosExtras;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        String nome, senha;
        boolean verdadeiro = true;

        System.out.println("------------------------------------------------------------------");
        System.out.println("");

        while(verdadeiro) {
            System.out.println("Digite o seu nome de usuário: ");
            nome = sc.next();
            System.out.println("Digite a sua senha: ");
            senha = sc.next();

            if(nome.equals(senha)) {
                System.out.println("O nome de usuário e a senha não podem ser iguais. Digite novamente.");
            }
            else {
                verdadeiro = false;
                System.out.println("Login concluído!");
            }
            System.out.println("------------------------------------------------------------------");
        }
    }

    public void exercicio2() {
        String nome;
        int idade = 0;
        double salario = 0;
        char sexo, estado;

        boolean verdadeiro = true;

        while(verdadeiro) {
            System.out.println("Seu nome: ");
            nome = sc.next();
            if(nome.length() < 3) {
                System.out.println("Seu nome deve ser maior que 3 caracteres. Digite novamente.");
            }
            else{
                verdadeiro = false;
            }
        }

        verdadeiro = true;
        while(verdadeiro) {
            System.out.println("Sua idade:");
            idade = sc.nextInt();
            if(idade < 0 || idade > 150) {
                System.out.println("Sua idade deve ser entre 0 e 150. Digite novamente.");
            }
            else {
                verdadeiro = false;
            }
        }

        verdadeiro = true;
        while(verdadeiro) {
            System.out.println("Seu salário: ");
            salario = sc.nextDouble();
            if(salario <= 0) {
                System.out.println("Seu salário deve ser maior do que 0. Digite novamente.");
            }
            else {
                verdadeiro = false;
            }
        }

        verdadeiro = true;
        while (verdadeiro) {
            System.out.println("Seu sexo('f' para feminino ou 'm' para masculino): ");
            sexo = sc.next().toLowerCase().charAt(0);
            if(sexo == 'f' || sexo == 'm') {
                verdadeiro = false;
            }
            else {
                System.out.println("Caractere inválidp. Digite novamente");
            }
        }

        verdadeiro = true;
        while (verdadeiro) {
            System.out.println("Seu estado civil('s' para solteiro, 'c' para casado, 'v' para viúvo ou 'd' para divorciado)");
            estado = sc.next().toLowerCase().charAt(0);
            if (estado == 's' || estado == 'c' || estado == 'v' || estado == 'd') {
                verdadeiro = false;
            } else {
                System.out.println("Caractere inválido. Digite novamente.");
            }
        }
    }

    public void exercicio3() {
        int anos=0;
        double taxaA = 0.03, taxaB = 0.015;
        double paisA = 80000, paisB = 200000;

        System.out.println("================================");
        System.out.println("População do país A: " + paisA + "habitantes");
        System.out.println("");
        System.out.println("População do país B: " + paisB + "habitantes");
        System.out.println("");
        System.out.println("================================");

        while(paisA < paisB) {
          paisA = paisA + (paisA * taxaA);
          paisB = paisB + (paisB * taxaB);
          anos++;
        }
        System.out.println("================================");
        System.out.println("");
        System.out.println("A quantidade de anos para o país A ultrapassar o país B em n° de habitantes é: " + anos + "anos");
        System.out.println("");
        System.out.println("================================");
    }

    public void exercicio4() {
        double paisA, paisB, taxaA, taxaB;
        int anos = 0;
        boolean verdadeiro = true;

        System.out.println("==================================================================");
        System.out.println("Informe o total de habitantes do país A: ");
        paisA = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país A: ");
        taxaA = sc.nextDouble();
        System.out.println("Informe o total de habitantes do país B: ");
        paisB = sc.nextDouble();
        System.out.println("Informe a taxa de crescimento do país B: ");
        taxaB = sc.nextDouble();

        while(verdadeiro) {
            paisA = paisA + (paisA * taxaA);
          paisB = paisB + (paisB * taxaB);
          anos++;

          if(paisA > paisB && taxaA > taxaB) {
            System.out.println("O país B nunca alcançará ou ultrapassará o país A em n° de habitantes");
          }
          else if(paisA > paisB && taxaA < taxaB) {
            System.out.println("O país B alcancará o país A em " + anos + "anos");
          }
          else if(paisB > paisA && taxaB > taxaA) {
            System.out.println("O país A nunca alcançará o país B");
            }
            else if(paisB > paisA && taxaB < taxaA) {
                System.out.println("O país A alcançará o país B em " + anos + "anos");
            }
            else {
                verdadeiro = false;
            }
        }
        }      
    }