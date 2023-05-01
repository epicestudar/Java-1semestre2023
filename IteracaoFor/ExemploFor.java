package IteracaoFor;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

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

        public void exercicio6() {
            double[] alunos = new double[10];
            double[] notas = new double[4];
            int cont = 0;

            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas.length; j++) {
                    System.out.println("Digite a nota "+(j+1)+" do aluno "+ (i+1) + ":");
                    notas[i] = sc.nextDouble();
                    alunos[i] += notas[j];
                }
                alunos[i] /= notas.length;

                if (notas[i] >= 7) {
                    cont++;
                }
            }
            System.out.println("N° de alunos com média maior ou igual a 7: " + cont);
            System.out.println("");
            for (int i = 0; i < alunos.length; i++) {
                System.out.println("A média do aluno "+(i+1)+" é"+ alunos[i]);
            }
            System.out.println("");
        }

        public void exercicio7() {
            int[] vetorA = new int[5];
            int[] totalSoma = new int[5];
            int[] totalMult = new int[5];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o número " + (i+1) + ":");
                vetorA[i] = sc.nextInt();
            }

            for (int i = 0; i < totalSoma.length; i++) {
                totalSoma[i] = vetorA[i] + vetorA[i];
            }

            for (int i = 0; i < totalMult.length; i++) {
                totalMult[i] = vetorA[i] * vetorA[i];
            }
            System.out.println("Os valores que você informou: ");

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println((i+1) + "º: " + vetorA[i]);
            }

            System.out.println("A soma dos vetores: "); 
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println((i+1) + "º: " + totalSoma[i]);
            }

            System.out.println("A multiplicação dos vetores ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println((i+1) + "º: " + totalMult[i]);
            }
        }

        public void exercicio8() {
            int vetorPessoas[] = new int[5];
            double altura[] = new double[5];
            int idade[] = new int[5];

            for (int i = 0; i < vetorPessoas.length; i++) {
                System.out.println("Digite a idade da pessoa " + (i+1) + ":");
                idade[i] = sc.nextInt();
                System.out.println("Informe a altura da pessoa " + (i+1) + ":");
                altura[i] = sc.nextDouble();
            }
        }

        public void exercicio9() {
            int[] vetor = new int[10];
            int[] vetorQuad = new int[10];
            int[] vetorTotal = new int[10];
            int j=0;

            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Informe para o vetor de índice " + (i+1) + ":");
                vetor[i] = sc.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                vetorQuad[i] = (int) Math.pow(vetor[i], 2);
            }
            for (int i = 0; i < vetor.length; i++) {
                vetorTotal[i] = vetorQuad[i] + vetorQuad[i];
            }

            System.out.println("A soma dos quadrados para cada elemento será: ");
            for (int i = 0; i < vetor.length; i++) {
                j++;
                System.out.println(j + "° " + vetorTotal[i]);
            }
        }
    }

