package TrabalhoJava.CalculadoraGastoViagem;

public class CustoViagem {
    public static void main(String[] args) {
        // Escrever o programa
        System.out.println("A distância percorrida é");
        double distanciaPercorrida = 148;
        System.out.println("O valor do combustível é");
        double valorCombustível = 5;
        System.out.println("O valor que o carro gasta por litro é");
        double valorGastoCarro = 10;
        double valorTotal = distanciaPercorrida/valorGastoCarro*valorCombustível;
        System.out.println("O valor que você gastará de Limeira até São Paulo será de " + valorTotal + " Reais"); 
        
    }
}
