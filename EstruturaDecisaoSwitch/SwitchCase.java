package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra(){
        //1. receber a letra digitada pelo usuário
        System.out.println("Informe uma Letra: ");
        String letra = sc.nextLine();
        //2. escolher o resultado referente a letra
        String tipoLetra = "";
        switch (letra) {
            case "a": tipoLetra = "vogal";
            break;
            case "e": tipoLetra = "vogal";
            break;
            case "i": tipoLetra = "vogal";
            break;
            case "o": tipoLetra = "vogal";
            break;
            case "u": tipoLetra = "vogal";
            break;
            default: tipoLetra = "consoante";
            break;
        }
        //3. mostrar o resultado para o usuário
    System.out.println(letra + " é do tipo " + tipoLetra);
    }
}
