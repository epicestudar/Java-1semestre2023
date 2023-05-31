package PooExercicio2;
import java.util.Scanner;

public class Agenda {
    Scanner sc = new Scanner(System.in);
    // atributos
    String nome;
    float altura;
    int idade;

    // métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void armazenaPessoa() {
        int cont=0;

        while(cont < 2) {
            System.out.println("Informe o seu nome: ");
            setNome(sc.next());
            System.out.println("Informe a sua idade: ");
            setIdade(sc.nextInt());
            System.out.println("Informe a sua altura: ");
            setAltura(sc.nextFloat());

            cont++;
        }
    }

   public void buscaPessoa(){
    String buscaPessoa;
    System.out.println("Informe o nome da pessoa que quer procurar: ");
    buscaPessoa = sc.next();

    for (int i = 0; i < 2; i++) {
        if(getNome().equals(buscaPessoa)){
            System.out.println("Esta pessoa está na posição: " + (i+1));
        }
    }
   }

   public void imprimeAgenda() {
    System.out.println("Dados das pessoas das agendas: ");

    for (int i = 0; i < 2; i++) {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getAltura());
    }
   }
}
