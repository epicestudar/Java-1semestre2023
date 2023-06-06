package ProjetoFinalSemestre;

public class Pessoa {
    String nome;
    int idade;
    int numeroConta;
    
    public Pessoa(String nome, int idade, int numeroConta) {
        this.nome = nome;
        this.idade = idade;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    
}
