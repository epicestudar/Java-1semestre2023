package CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
    public void calcular(){
        System.out.println("Informe a distância percorrida");
        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Informe o Tempo Gasto");
        double tempoGasto = sc.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("A velocidade média é " + velocidadeMedia + "Km/H");


    }
    public void destino(){ // atividade extra
        System.out.println("Informe o Ponto de Partida");
        String origem = sc.next();
        System.out.println("Informe o Ponto de Destino");
        String destino = sc.next();
        System.out.println("Sua viagem é de " + origem + " até " + destino);
    }
}

