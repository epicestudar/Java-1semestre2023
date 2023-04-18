package ExercicioOperadores;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void nota() {
        System.out.println("Informe a nota 1");
        int notaUm = sc.nextInt();
        System.out.println("Informe a nota 2");
        int notaDois = sc.nextInt();
        
        // operação aritimética
        double médiaPonderada = (notaUm + notaDois) / 2;
        System.out.println("A média do aluno é " + médiaPonderada);
        
        // operação relacional
        boolean mediaAprovada = médiaPonderada>= 50;
        System.out.println("O aluno está aprovado por nota? " +mediaAprovada);
        System.out.println("Informe a frequência do aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovada = frequenciaAluno>= 75;
        System.out.println("O aluno está reprovado por frequência? " + frequenciaAprovada);
        
        // Operação lógica
        boolean resultadoFinal = (mediaAprovada==true) && (frequenciaAprovada==true);
        System.out.println("O aluno está aprovado no curso? " + resultadoFinal);
        sc.close();
    }

}
