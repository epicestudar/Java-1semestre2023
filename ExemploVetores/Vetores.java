package ExemploVetores;

import java.util.Scanner;

public class Vetores {

    Scanner sc = new Scanner(System.in);
    // criando método
    public void exemplo1() {
        // criando um vetor
        double[] valores = new double[] {11.7, 5, 123, 4.1};
        System.out.println("1º Posição- Índice[0]:" + valores[0]);
        System.out.println("2º Posição- Índice[1]:" + valores[1]);
        System.out.println("3º Posição- Índice[2]:" + valores[2]);
        System.out.println("4º Posição- Índice[3]:" + valores[3]);

        //Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do índice [0]
        System.out.println("1º Posição- Índice[0]:" + valores[0]);
    }

    public void exemplo2() {
        // criando o vetor
        int[] novosValores = new int[5];
        novosValores[0] = 15;
        novosValores[1] = 11;
        novosValores[2] = 17;
        novosValores[3] = 25;
        novosValores[4] = 6;
        System.out.println("O vetor é : posição [0]= " + novosValores[0]);
        System.out.println("O vetor é : posição [1]= " + novosValores[1]);
        System.out.println("O vetor é : posição [2]= " + novosValores[2]);
        System.out.println("O vetor é : posição [3]= " + novosValores[3]);
        System.out.println("O vetor é : posição [4]= " + novosValores[4]);
    }

    //exercícios para fazer em casa
    public void exercicio1() {
        double[] novosValores = new double[10];
        novosValores[0] = 15.9;
        novosValores[1] = 11.2;
        novosValores[2] = 17.5;
        novosValores[3] = 25.4;
        novosValores[4] = 6.1;
        novosValores[5] = 16.8;
        novosValores[6] = 26.7;
        novosValores[7] = 36.3;
        novosValores[8] = 46.6;
        novosValores[9] = 56.2;
        System.out.println("O vetor é : posição [0]= " + novosValores[0]);
        System.out.println("O vetor é : posição [1]= " + novosValores[1]);
        System.out.println("O vetor é : posição [2]= " + novosValores[2]);
        System.out.println("O vetor é : posição [3]= " + novosValores[3]);
        System.out.println("O vetor é : posição [4]= " + novosValores[4]);
        System.out.println("O vetor é : posição [5]= " + novosValores[5]);
        System.out.println("O vetor é : posição [6]= " + novosValores[6]);
        System.out.println("O vetor é : posição [7]= " + novosValores[7]);
        System.out.println("O vetor é : posição [8]= " + novosValores[8]);
        System.out.println("O vetor é : posição [9]= " + novosValores[9]);
    }

    public void exercicio2() {
        System.out.println("Informe a sua nota 1:");
        double notaUm = sc.nextDouble();

        System.out.println("Informe a sua nota 2:");
        double notaDois = sc.nextDouble();

        System.out.println("Informe a sua nota 3:");
        double notaTres = sc.nextDouble();

        System.out.println("Informe a sua nota 4:");
        double notaQuatro = sc.nextDouble();

        double mediaPonderada = (notaUm + notaDois + notaTres + notaQuatro) / 2;

        double[] mostrarMedia = new double[4];
        mostrarMedia[0] = notaUm;
        mostrarMedia[1] = notaDois;
        mostrarMedia[2] = notaTres;
        mostrarMedia[3] = notaQuatro;

        System.out.println("Sua nota 1 é : " + mostrarMedia[0]);
        System.out.println("Sua nota 2 é : " + mostrarMedia[1]);
        System.out.println("Sua nota 3 é : " + mostrarMedia[2]);
        System.out.println("Sua nota 4 é : " + mostrarMedia[3]);
        System.out.println("Sua média é : " + mediaPonderada);
    }
}
