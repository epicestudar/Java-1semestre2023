package PooExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random();
       // criar um vetor para 10 objetos
       Agenda contatos[] = new Agenda[10];
       //criar os objetos e preencher as informações
       for (int i = 0; i < contatos.length; i++) {
        // criar o objeto - construtor
        contatos[i] = new Agenda();
        // preencher os atributos
        contatos[i].setNome(JOptionPane.showInputDialog("Digite o nome: "));
        contatos[i].setAltura(rd.nextInt(200)/100);
        contatos[i].setIdade(i + 18);
       }

       // criar um método para achar a pessoa do Array
       String buscaNome = JOptionPane.showInputDialog("Informe o nome a ser buscado");
       boolean busca = true;
       int cont=0;

       while(busca) {
        if(buscaNome.equals(contatos[cont].getNome())){
            busca = false;
            contatos[cont].imprimir();
        }
        cont++;
       }
    }
}
