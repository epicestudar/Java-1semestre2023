package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int i=0;

        while(i>-1)  { // irá fazer um loop infinito
            System.out.println("O n° da iteração é " + i);
            i++; // i=i + 1; i+=1;
        }
    }

    public void exemplo2() {
        int vetor [] = new int[10];
        int i=0;

        while (i<10) {
            System.out.println("Informe o valor do vetor["+i+"]=");
            vetor[i]=sc.nextInt();
            i++;
        }
        while(i>0) {
            i--;
            System.out.println("vetor["+i+"]=" + vetor[i]);
        }
    }

    public void exemplo3() {
        Random rd = new Random();
        int nAleatorio = rd.nextInt(10)+1;
        boolean TenteNovamente = true;

        while(TenteNovamente) {
            System.out.println("Digite um n° de 1 a 10");
            int nDigitado = sc.nextInt();
            if(nDigitado == nAleatorio) {
                System.out.println("Acertouuuuuu");
                TenteNovamente = false;
            } else{
                System.out.println("Errouuuuuuu");
            }
        }
    }
}
