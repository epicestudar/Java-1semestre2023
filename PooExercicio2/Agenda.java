package PooExercicio2;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    // atributos
    String nome;
    double altura;
    int idade;

    // métodos
    // construtor com parâmetros
    public Agenda(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    // construtor vazio
    public Agenda() {

    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos de aplicações dievrsas
    // void
    

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n Altura: " + altura + "\nIdade: " + idade);
    }
}