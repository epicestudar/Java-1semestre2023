package ExerciciosPooHeranca;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas();
        pessoa1.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        pessoa1.setAltura(1.80);
        pessoa1.setAnoNascimento(2006);
        pessoa1.setMesNascimento(2);
        pessoa1.setDiaNascimento(6);

        pessoa1.imprimir();
        pessoa1.idade();
    }
}
