package ExercicioGrupo;
import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);
    public void exercicio() {

        System.out.println("Informe sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Informe seu sexo: 1 - feminino, 2 - masculino:");
        int sexo = sc.nextInt();
        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        double pesoIdeal = (peso * altura);
       double imc = peso / (altura * altura);

        

        switch (sexo) {
            case 1:{
                double formulaMulher = (62.1 * altura) - 44.7;
                if (formulaMulher >= 20 && formulaMulher <= 27)
                {
                    System.out.println("O seu peso é normal");
                }

                else if (formulaMulher < 20)
                {
                    System.out.println("Você está abaixo do peso ideal");
                }
                else if (formulaMulher > 27)
                {
                    System.out.println("Você está acima do peso");
                }
                break;
            }

            case 2:{
                double formulaHomem = (72.7 * altura) - 58;
                if (formulaHomem >= 20 && formulaHomem <= 27)
                {
                    System.out.println("O seu peso é normal");
                }

                else if (formulaHomem < 20)
                {
                    System.out.println("Você está abaixo do peso ideal");
                }
                else if (formulaHomem > 27)
                {
                    System.out.println("Você está acima do peso");
                }
                break;
            }
        
            default:{
                break;
        }

        if ( (imc >= 27) && (idade >= 25 && idade <= 45) ) {
            System.out.println( "As atividades recomendadas são: Musculação Intensa e Luta" );
        }
        else if ( (imc >= 27) && (idade >= 16 && idade < 25) ) {
            System.out.println( "A atividade recomendada é: luta" );
        }
        else if ( (imc >= 27) && (idade >= 46 && idade <= 55) ){
            System.out.println( "As atividades recomendadas são: Luta e Pilates" );
        }
        else if ((imc > 27) && (idade >= 56)) {
            System.out.println( "A atividade recomendada é: Pilates" );
        }
        else if (  (imc > 20 && imc < 27) && (idade >= 16 && idade < 25)  ){
            System.out.println("As atividades recomendadas são: Musculação Moderada e Dança");
        }
        else if ( (imc > 20 && imc < 27) && (idade >= 25 && idade <= 55) ) {
            System.out.println("As atividades recomendadas são: Corrida, Musculação Moderada e Dança");
        }
        else if ( (imc > 20 && imc < 27) && (idade >= 56 && idade <= 65)){
            System.out.println("As atividades recomendadas são: Corrida e Dança");
        }
        else if ((imc > 20 && imc < 27) && (idade >= 66)){
            System.out.println("A atividade recomendada é: Dança");
        }
        else if ( (imc >= 27) && (idade >= 16 && idade < 25) ) {
            System.out.println("As atividades recomendadas são: Musculação Leve e Yoga");
        }
        else if ( (imc >= 27) && (idade >= 25 && idade <= 45) ) {
            System.out.println("A atividade recomendada é: Yoga");
        }
        else {
            System.out.println("As atividades recomendadas são: Musculação Leve e Yoga");
        }
    }
}
}

