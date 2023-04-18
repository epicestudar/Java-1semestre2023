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
        double vetorA[] = new double [10];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetor["+i+"]=");
            vetorA[i] = sc.nextInt();
        }
        for (int i = vetorA.length - 1; i>=0; i--) {
            System.out.println("vetor["+i+"]=" +vetorA[i]);
        }
    }

    public void exercicio3() {
        double vetorA[] = new double [4];
        double media;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Nota["+i+"]=");
            vetorA[i] = sc.nextInt();
        }

        media = (vetorA[0] + vetorA[1] + vetorA[2] + vetorA[3]) / 4;
        System.out.println("==============");
            System.out.println("Sua média é:" + media);
        }

        public void exercicio4() {
            //criar um vetor de 10 caracteres
            String letras[] = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k"};

            //percorrer o vetor para achar as consoantes
            int contador=0; // contador para as consoantes
            for (int i = 0; i < letras.length; i++) {
                //tomada de decisão: vogal ou consoante
                if(letras[i]!="a" && letras[i]!="e" && letras[i]!="i" && letras[i]!="o" && letras[i]!="u") {
                    System.out.println(letras[i] + "é consoante");
                    contador++;
                }
                // mostrar o n° de consoantes
                System.out.println("O n° de consoantes é: " + contador);
            }
        }

        // exercicio 4 extra - lendo as consoantes de uma palavra
        public void exercicio4Ex() {
            // usuário vai digitar uma palavra
            System.out.println("Digite uma palavra: ");
            String letras = sc.next();
            letras = letras.toLowerCase(); // deixar tudo em minúsculo

            int contador=0;
            for (int i = 0; i < letras.length(); i++) {
                char c = letras.charAt(i);
                if(c !='a' && c !='e' && c !='i' && c!='o' && c!='u') {
                    System.out.println(c + " é consoante");
                    contador++;
                }
                
            }
        }

        public void exercicio5() { // 20 n°s e determinar os pares e ímpares em outros vetores
            int vetorNumeros[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};      
            int contPar=0;
            int contImpar=0;
            // percorrer o meu vetor e contar os meus n° pares e ímpares
            for (int i = 0; i < vetorNumeros.length; i++) {
                if(vetorNumeros[i]%2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
            int nPar[] = new int[contPar];
            int nImpar[] = new int[contImpar];
            // distribuir os n° nos vetores par e impar
            contPar=0;
            contImpar=0;
            for (int i = 0; i < vetorNumeros.length; i++) {
                if(vetorNumeros[i] % 2==0) {
                    nPar[contPar] = vetorNumeros[i];
                    contPar++;
                }
                else {
                    nImpar[contImpar] = vetorNumeros[i];
                    contImpar++;
                }
            }

            for (int i = 0; i < vetorNumeros.length; i++) {
                System.out.println("vetor["+i+"]=" + vetorNumeros[i]);
            }
            for (int i = 0; i < nPar.length; i++) {
                System.out.println("vetor["+i+"]=" + nPar[i]);
            }
            for (int i = 0; i < nImpar.length; i++) {
                System.out.println("vetor["+i+"]=" + nImpar[i]);
            }
        }
    }

