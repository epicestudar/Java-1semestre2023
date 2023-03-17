package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    // exercicio 1
    public void exercicio1() {
        System.out.println("Informe o valor 1: ");
        double valorUm = sc.nextDouble();
        System.out.println("Informe o valor 2: ");
        double valorDois = sc.nextDouble();
        if (valorUm > valorDois) {
            System.out.println("O valor 1 é maior do que o valor 2");
        } else if (valorDois > valorUm) {
            System.out.println("O valor 2 é maior do que o valor 1");
        }
        else {
            System.out.println("Os números são iguais");
        }
    }

    // exercicio 2
    public void exercicio2() {
        System.out.println("Informe o seu ano de nascimento: ");
        double anoNascimento = sc.nextDouble();
        double podeVotar = 2022 - anoNascimento;
        if (podeVotar >= 18) {
            System.out.println("Você poderá votar");
        } else {
            System.out.println("Não poderá votar");
        }
    }

    // exercicio 3
    public void exercicio3() {
        System.out.println("Informe a senha para acessar o computador: ");
        double senhaComputador = sc.nextDouble();
        if (senhaComputador == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    // EXERCICIO 4
    public void exercicio4() {
        System.out.println("Quantas maçãs você pegou?");
        double macaPegada = sc.nextDouble();
        if (macaPegada >= 12) {
            double total = macaPegada * 0.25;
            System.out.println("O valor que você pagará é " + total);
        } else if (macaPegada < 12) {
            double total = macaPegada * 0.30;
            System.out.println("O valor que você pagará é " + total);
        }
    }

    // exercicio 5
    public void exercicio5() {
        System.out.println("Informe o valor 1: ");
        int valorUm = sc.nextInt();
        System.out.println("Informe o valor 2: ");
        int valorDois = sc.nextInt();
        System.out.println("Informe o valor 3: ");
        int valorTres = sc.nextInt();
        if (valorUm < valorDois && valorUm < valorTres && valorDois < valorTres) {
            System.out.println("A ordem crescente é " + valorUm + "," + valorDois + "," + valorTres);
        } else if (valorDois < valorUm && valorDois < valorTres && valorUm < valorTres) {
            System.out.println("A ordem crescente é " + valorDois + "," + valorUm + "," + valorTres);
        } else if (valorTres < valorUm && valorTres < valorDois && valorUm > valorDois) {
            System.out.println("A ordem crescente é " + valorTres + "," + valorDois + "," + valorUm);
        } else if (valorUm < valorDois && valorUm < valorTres && valorDois > valorTres) {
            System.out.println("A ordem crescente é " + valorUm + "," + valorTres + "," + valorDois);
        } else if (valorDois < valorUm && valorDois < valorTres && valorTres < valorUm) {
            System.out.println("A ordem crescente é " + valorDois + "," + valorTres + "," + valorUm);
        } else if (valorTres < valorUm && valorTres < valorDois && valorDois > valorUm) {
            System.out.println("A ordem crescente é " + valorTres + "," + valorUm + "," + valorDois);
        }
    }

    // exercicio 6
    public void exercicio6() {
        System.out.println("Informe a sua altura");
        double altura = sc.nextDouble();
        System.out.println("Informe o seu sexo. Digite 1 se for homem e 2 se for mulher.");
        int sexo = sc.nextInt();
        if (sexo == 1) {
            double formulaHomem = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é " + formulaHomem);
        } else if (sexo == 2) {
            double formulaMulher = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é " + formulaMulher);
        }
    }

    public void nota() {
        System.out.println("Informe a nota 1 (de 0 a 100): ");
        int notaUm = sc.nextInt();
        System.out.println("Informe a nota 2 (de 0 a 100): ");
        int notaDois = sc.nextInt();
        double médiaPonderada = (notaUm + notaDois) / 2;
        System.out.println("Informe sua frequência nas aulas, de 0 a 100: ");
        int frequencia = sc.nextInt();
        if (médiaPonderada >= 50 && frequencia >= 75) {
            System.out.println("Parabéns! Você passou de ano.");
        } else if (médiaPonderada <= 50 && frequencia >= 75 || médiaPonderada >= 50 && frequencia <= 50
                || médiaPonderada <= 50 && frequencia <= 75) {
            System.out.println("Essa não! Você reprovou de ano.");
        }
    }

    // exercicios extras
    public void exercicio7() {
        System.out.println("Informe um valor inteiro: ");
        int valor = sc.nextInt();
        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par!");
        } else {
            System.out.println("O número " + valor + " é ímpar!");
        }
    }

    public void exercicio8() {
        System.out.println("Informe sua nota de matemática: ");
        double notaMat = sc.nextDouble();
        System.out.println("Informe sua nota de física: ");
        double notaFisica = sc.nextDouble();
        double média = (notaFisica + notaMat) / 2;
        if (média >= 7) {
            System.out.println("Parabéns! Sua média foi " + média + " e com isso você passou de ano.");
        } else if (média >= 5 && média < 7) {
            System.out.println("Sua média foi " + média + "."
                    + " Caso queira, você poderá fazer uma prova de recuperação para aumentar a sua nota");
        } else if (média < 5) {
            System.out.println("Sua média foi " + média + "." + " Com isso, você reprovou de ano.");
        }

    }

    public void exercicio9() {
        System.out.println("Digite uma letra: ");
        String N = sc.next();

        if (N.equalsIgnoreCase("a") || N.equalsIgnoreCase("e") || N.equalsIgnoreCase("i") || N.equalsIgnoreCase("o")
                || N.equalsIgnoreCase("u")) {
            System.out.println("A letra digitada é vogal");
        } else {
            System.out.println("A letra digitada é consoante");
        }
    }

    public void exercicio10() {
        System.out.println("Informe o seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 1280) {
            System.out.println("Salário antes do reajuste: " + salario
                    + "\nPercentual aplicado: 20%\nValor do aumento do salário: R$" + (salario * 0.2)
                    + "\nNovo salário, após aumento: R$" + (salario * 1.2));
        }

        else if (salario > 1280 && salario <= 1700) {
            System.out.println("Salário antes do reajuste: " + salario
                    + "\nPercentual aplicado: 20%\nValor do aumento do salário: R$" + (salario * 0.15)
                    + "\nNovo salário, após aumento: R$" + (salario * 1.15));
        }

        else if (salario > 1700 && salario <= 2500) {
            System.out.println("Salário antes do reajuste: " + salario
                    + "\nPercentual aplicado: 20%\nValor do aumento do salário: R$" + (salario * 0.10)
                    + "\nNovo salário, após aumento: R$" + (salario * 1.10));
        } else if (salario > 2500) {
            System.out.println("Salário antes do reajuste: " + salario
                    + "\nPercentual aplicado: 20%\nValor do aumento do salário: R$" + (salario * 0.05)
                    + "\nNovo salário, após aumento: R$" + (salario * 1.05));
        }
    } 
}


    /**
     * 
     */


