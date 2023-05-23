package ListaAtividadeFormativa;
import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int matriz[][];
        int linha=0;
        int coluna=0;

        System.out.println("Informe a quantidade de linhas da matriz");
        linha = sc.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz");
        coluna = sc.nextInt();

        matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }


        System.out.println("Matriz sorteada: ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i > j) {
                    matriz[i][j] = 1;
                }
                else if(i == j) {
                   matriz[i][j]=0;
                }
                else if(j > i) {
                    matriz[i][j] = 2;
                }
            }
        }

        System.out.println("===========================================================");
        System.out.println("Matriz com as condições:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int cont=1;
        int nSorteado;
        int palpite = -1;

        nSorteado = rd.nextInt(1000);
        

        while(palpite != nSorteado) {
            System.out.println("Informe o seu palpite de n° sorteado: ");
            palpite = sc.nextInt();
            cont++;
            if(palpite > nSorteado) {
                System.out.println("O n° que você digitou é diferente do sorteado e maior do que o sorteado. Tente novamente.");
            }
            else if(palpite < nSorteado) {
                System.out.println("O n° que você digitou é diferente do sorteado e menor do que o sorteado. Tente novamente.");
            }
            else if(palpite == nSorteado) {
                System.out.println("Parabéns! Você acertou o n° sorteado.");
                System.out.println("O n° de tentativas até o acerto foi de: " + cont);
            }
        }
    }

    public void exercicio3() {
        int vetor[];
        int tamanhoVetor = rd.nextInt(901) + 100;
        vetor = new int[tamanhoVetor];
        int contadorPares=0;
        int contadorImpares=0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
        }

        System.out.println("Números pares: ");

        for (int i = 0; i< vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + "; ");
            }
        }
        System.out.println("===================================");

        System.out.println("N°s ímpares: ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + "; ");
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0 & i % 2 != 0){
                contadorPares++;
            }
            else if(vetor[i] % 2 != 0 & i % 2 == 0 ){
                contadorImpares++;
            }
        }

        System.out.println("===================================================================================");

        System.out.println("N°s pares na posição ímpar: " + contadorPares);
        System.out.println("N°s ímpares na posição par: " + contadorImpares);
    }
}
