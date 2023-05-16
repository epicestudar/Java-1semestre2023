package PooIntroducao;

public class App {
    public static void main(String[] args) {
        // criando objetos
        RegistraAluno aluno1 = new RegistraAluno(); 
        RegistraAluno aluno2 = new RegistraAluno();

        // setando os atributos com set
        aluno1.setNome("Ana Carla Pereira");
        aluno1.setIdade(18);
        aluno1.setEndereco("Rua das paineiras");
        aluno1.setNotaCiencias(6);
        aluno1.setNotaMatematica(10);
        aluno1.setNotaPortugues(4);


        aluno2.setNome("Carlos");
        aluno2.setIdade(15);
        aluno2.setEndereco("Rua dos bobos");
        aluno2.setNotaCiencias(3);
        aluno2.setNotaMatematica(5);
        aluno2.setNotaPortugues(8);

        // mostrando os atributos com get
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Endereço: " + aluno1.getEndereco());
        System.out.println("Média: " + aluno1.getMedia());

        System.out.println("=====================================================");
        
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Endereço: " + aluno2.getEndereco());
        System.out.println("Média: " + aluno2.getMedia());
    }
}
