package ExerciciosPooHeranca;

import javax.xml.crypto.Data;

// exercício 1 da lista de exercícios do PDF 16 de POO (construtores)

public class Pessoas {
    private String nome;
    private double altura;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    // criar os métodos
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
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // métodos solicitados (void ou return)
    // printar todas as informações das pessoas

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
    }
    
    // calcular a idade
    public void idade() {
        int idade =0;
        if(diaNascimento <=30 && mesNascimento<=5) {
        idade = 2023 - anoNascimento;
        }
        else {
            idade = 2023 - anoNascimento - 1;
        }
        System.out.println("A idade é: " + idade);
    }
}
