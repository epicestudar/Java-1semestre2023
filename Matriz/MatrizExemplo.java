package Matriz;
import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar, preencher e manipular a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // 2 dimensões

        //preencher a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10);
            }
        }

        // impressão dos elementos da minha matriz de forma individual
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz["+i+"]["+j+"]=" + matriz[i][j]);
            }
        }

        // imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("|");
        }
    }

    public void exemplo2() { // somar os n°s da quarta linha da matriz
         // criar, preencher e manipular a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // 2 dimensões
        int soma = 0;

        //preencher a minha matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10);
            }
        }

        // impressão dos elementos da minha matriz de forma individual
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz["+i+"]["+j+"]=" + matriz[i][j]);
            }
        }

        // imprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < 9; i++) {
            soma += matriz[3][i];
        }
        System.out.println("Soma da 4° linha= " + soma);

        //somar os itens da 4° coluna
        int coluna=0;
        for (int i = 0; i < 10; i++) {
            coluna += matriz[i][3];
        }

        System.out.println("A soma da 4° coluna é: " + coluna);
    }

    public void exercicio1() { // exercicios extras do PDF matriz
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
       int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(4);
            }
        }

        System.out.println("Matriz normal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("|");
        }

        System.out.println("==================");
        System.out.println("Matriz transposta: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+ " ");
            }
            System.out.println("|");
        }

        // calcular a soma dos elementos na diagonal principal
        int soma =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + soma);
    }

    public void exercicio3() { // exercicio extra - fazer a soma dos n°s acima da diagonal principal e soma dos n°s abaixo da diagonal principal
        int matriz[][] = new int[4][4];
        int somaCima =0;
        int somaBaixo=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(4);
            }
        }

        System.out.println("Matriz normal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("|");
        }

        // soma acima da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(j > i) {
                    somaCima+= matriz[i][j];
                }
            }
        }

        //soma abaixo da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i > j) {
                    somaBaixo+= matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos n° acima da diagonal principal: " + somaCima);
        System.out.println("Soma dos n° abaixo da diagonal principal: " + somaBaixo);
    }
    }

