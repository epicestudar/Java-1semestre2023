package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for(int i=0; i<10; i++) {
            System.out.println("O nº da iteração é " + i);
        }
    }

    public void exemplo2() {
        double carrinhoCompra[] = new double[] {25.69, 50.4, 86.3, 91,1};
        double valorFinalCompra = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinalCompra += carrinhoCompra[i];
            System.out.println("Valor parcial da compra R$" + valorFinalCompra);
        }
        System.out.println("O valor da compra é R$" + valorFinalCompra);
    }

    public void exercicio1() {
        int vetorA[] = new int[5];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor["+i+"]=");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("==================");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor["+i+"]=" +vetorA[i]);
        }
    }

    public void exercicio2() {
        int vetorA[] = new int[5];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor["+i+"]=");
            vetorA[i] = sc.nextInt();
        }
        for (int i = vetorA.length - 1; i>=0; i--) {
            System.out.println("vetor["+i+"]=" +vetorA[i]);
        }
    }
}
