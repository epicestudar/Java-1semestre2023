package ExercíciosIfElse2;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    // exercício 1 da lista 2
    public void exercicio1() {
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        if(numero > 10) {
            System.out.println("O número que você digitou é maior do que 10");
        }
        else if(numero < 10) {
            System.out.println("O número que você digitou é menor do que 10");
        }
        else {
            System.out.println("O número que você digitou é exatamente 10");
        }

    }

    // exercício 2
    public void exercicio2() {
            
    }
}
