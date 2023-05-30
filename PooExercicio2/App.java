package PooExercicio2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Agenda obj[] = new Agenda[10]; // vetor de 10 objetos

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Agenda(); // construindo o objeto

            // preencher meu objeto
            obj[i].setNome(JOptionPane.showInputDialog("Informe o nome: "));
            obj[i].setAltura((JOptionPane.showInputDialog("Informe a altura: ")));
            obj[i].setIdade((JOptionPane.showInputDialog("Informe o idade: ")));
        }
    }
}
