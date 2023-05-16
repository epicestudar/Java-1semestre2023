package PooIntroducao;

public class RegistraAluno {
    // declaração dos atributos do objeto
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;

    // atributo da classe
    private static int contadorEstudante;

    // criação de metodos de acesso (get)
    // retorna o this. do estudante
    public String getNome() {
        return nome;
    }

    // retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }

    // retorna idade do estudante
    public int getIdade() {
        return idade;
    }

    // retorna a média do estudante
    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica
                + notaPortugues
                + notaCiencias) / 3;
        return resultado;
    }

    // retorna a quantidade de estudantes cadastrados
    public static int getQauntidadeAlunos() {
        return contadorEstudante;
    }

    // método de definição set
    // define ou altera o this. do estudante
    public void setNome(String nome) {
        this.nome = nome;
    }

    // define ou altera o endereço do estudante
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // define ou altera o endereço do estudante
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // define ou altera o endereço do estudante
    public void setNotaMatematica(double resultado) {
        notaMatematica = resultado;
    }

    // define ou altera o endereço do estudante
    public void setNotaPortugues(double resultado) {
        notaPortugues = resultado;
    }

    // define ou altera o endereço do estudante
    public void setNotaCiencias(double resultado) {
        notaCiencias = resultado;
    }
}
