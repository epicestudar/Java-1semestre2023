package PooExercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador elevador1 = new Elevador(10, 10);

        //iniciar
        elevador1.inicializa();
        boolean ligado = true;
        // loop do elevador
        while(ligado){
            System.out.println("Digite a ação desejada: " + "\n Entrar: " + "\n Sair: " + "\n Subir: " + "\n Descer: " + "\n Desligar: ");
            int acao = sc.nextInt();
            switch (acao) {
                case 1:
                System.out.println("Capacidade atual: " + elevador1.entra());
                break;

                case 2:
                System.out.println("Capacidade atual: " + elevador1.sair());
                break;

                case 3:
                System.out.println("Capacidade atual: " + elevador1.subir(sc.nextInt()));
                break;

                case 4:
                System.out.println("Capacidade atual: " + elevador1.descer(sc.nextInt()));
                break;

                case 5:
                ligado = false;

                default:
                System.out.println("Digite uma ação válida: ");
                break;
            }
        }
    }
}
