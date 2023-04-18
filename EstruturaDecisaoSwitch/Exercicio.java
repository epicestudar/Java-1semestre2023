package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);
    public void mes() {
        System.out.println("Informe o número referente ao mês: ");
        int numero = sc.nextInt();

        String tipoMes = "";
        switch (numero) {
            case 1: tipoMes = "Janeiro";
            break;

            case 2: tipoMes = "Fevereiro";
            break;

            case 3: tipoMes = "Março";
            break;

            case 4: tipoMes = "Abril";
            break;

            case 5: tipoMes = "Maio";
            break;

            case 6: tipoMes = "Junho";
            break;

            case 7: tipoMes = "Julho";
            break;

            case 8: tipoMes = "Agosto";
            break;

            case 9: tipoMes = "Setembro";
            break;

            case 10: tipoMes = "Outubro";
            break;

            case 11: tipoMes = "Novembro";
            break;

            case 12: tipoMes = "Dezembro";
            break;

            default: tipoMes = "Não é um mês válido!";
            break;
        }
        System.out.println("O número " + numero + " pertence ao mês de " + tipoMes);
    }
}
