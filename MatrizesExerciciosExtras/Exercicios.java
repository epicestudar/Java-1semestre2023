package MatrizesExerciciosExtras;
import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
       int maior= matriz[0][0];
       int posI = 0;
       int posJ = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(4);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posI = i + 1;
                    posJ = j + 1;
                }
            }
        }
        System.out.println("Maior linha=" + posI);
        System.out.println("Maior coluna=" + posJ);
        }

        public void exercicio3() {
            int matriz[][] = new int[5][5];
            int x = 0;
            int posI = 0;
            int posJ = 0;

            System.out.println("Digite o valor de x: ");
                    x = sc.nextInt();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = rd.nextInt(4);
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("|");
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(x == i || x == j) {
                        x = matriz[i][j];
                        posI = i + 1;
                        posJ = j + 1;
                       
                    }
                }
            }

            System.out.println("X está na linha:" + posI + "e na coluna:" + posJ);
            
        }

        public void exercicio4() {
            double matriz [][] = new double[10][10];

           for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(4);
            }
           }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(i < j) {
                        matriz[i][j] =  2 * i + 7*j - 2;
                    }
                    else if (i == j) {
                        matriz[i][j] = Math.pow(3 * i, 2) - 1; 
                    }
                    else if(i > j) {
                        matriz[i][j] = Math.pow(4 * i, 3) - Math.pow(5 * j, 2) + 1;
                    }
                }
            }

            System.out.println("Matriz com os cálculos: ");

            for (int i = 0; i < matriz.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("|");
            }
        }

        public void exercicio5() {
            int matriz[][] = new int[5][4];
            int alunoUm, alunoDois, alunoTres;
            int nMatricula;

            System.out.println("Seu n° de matrícula: ");
                    alunoUm = sc.nextInt();
                    nMatricula = sc.nextInt();
                    System.out.println("Seu n° de matrícula: ");
                    alunoDois = sc.nextInt();
                    nMatricula = sc.nextInt();
                    System.out.println("Seu n° de matrícula: ");
                    alunoTres = sc.nextInt();
                    nMatricula = sc.nextInt();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[j].length; j++) {
                    
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[j + 1].length; j++) {
                    System.out.println("Fodaseeeeeee");
                }
            }
        }

        public void exercicio5Ex() {
            double id = 0, maioral = 0;
		double[][] mat = new double[5][4];

		for (int i = 0; i < 5; i++) {
			System.out.println("entre com a matricula/ media da prova / media dos trabalhos. do aluno "+ (i+1));
			for (int j = 0; j < 4; j++) {
				mat[i][j] = sc.nextDouble();
				if(j==2) {
                    mat[i][j+1] =((mat[i][j]+mat[i][j-1])/2);
                    if(mat[i][j+1]>maioral) 
                    maioral=mat[i][j+1];j++;}
				
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j % 4 == 0)System.out.print("\n");
				System.out.print(mat[i][j]+"  ");
				
				

			}
		}
		System.out.println("\na maior nota final: " + maioral);
		System.out.println(" Matrícula Responsavel: " + id);
	}

        public void exercicio6() {
            int A[][] = new int[3][3];
            int B[][] = new int[3][3];
            int C[][] = new int[3][3];
            
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    A[i][j] = rd.nextInt(4);
                }
            }

            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    B[i][j] = rd.nextInt(4);
                }
            }

            System.out.println("Matriz A: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < A.length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("|");
            }

            System.out.println("Matriz B: ");

            for (int i = 0; i < B.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < B.length; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println("|");
            }


            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    for (int j2 = 0; j2 < A[i].length; j2++) {
                        C[i][j] += A[i][j2] * B[i][j2];  
                    }
                }
            }

            System.out.println("Matriz C: ");
            for (int i = 0; i < C.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < C.length; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println("|");
            }
        }
}
