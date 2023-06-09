package ProjetoFinalSemestre;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conta extends Pessoa{
    Scanner sc = new Scanner(System.in);

    public Conta(String nome, int idade, int numeroConta) {
        super(nome, idade, numeroConta);
    }
    int codigo=0;
    double saldo;
    double saque;
    double deposito;
    double emprestimo;
   String contaTipo;

    

    public Conta(String nome, int idade, int numeroConta, Scanner sc, double saldo, double saque, double deposito,
        double emprestimo, String contaTipo) {
    super(nome, idade, numeroConta);
    this.sc = sc;
    this.saldo = saldo;
    this.saque = saque;
    this.deposito = deposito;
    this.emprestimo = emprestimo;
    this.contaTipo = contaTipo;
}
    

     public void criarConta() {
        JOptionPane.showMessageDialog(null,"Criação de Contas (Somente pessoas maiores de 18 podem criar uma conta).");
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        if (getIdade() > 18) {
            int receber = Integer.parseInt(JOptionPane
                    .showInputDialog("Escolha o tipo de conta (1 - Conta Pessoa Física; 2 - Conta Pessoa Jurídica)"));

            switch (receber) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Física");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
                    codigo++;
                    setContaTipo("Conta PF: ");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Jurídica");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
                    codigo++;
                    setContaTipo("Conta PJ");
                    break;
                }

                default:
                    JOptionPane.showMessageDialog(null, "Selecione um desses valores!");
                    break;
            }
        }
        else
        JOptionPane.showMessageDialog(null,"Somente adultos maiores de 18 anos podem criar conta!");
    }



    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getSaque() {
        return saque;
    }


    public void setSaque(double saque) {
        this.saque = saque;
    }


    public double getDeposito() {
        return deposito;
    }


    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }


    public double getEmprestimo() {
        return emprestimo;
    }


    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }


    public String getContaTipo() {
        return contaTipo;
    }


    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }


    public void emprestimo(int valorSolicitado) {
        System.out.println("Informe o valor do empréstimo que deseja");
        if(valorSolicitado >= 200.000) {
            System.out.println("O valor do empréstimo é maior do que o permitido. O valor máximo de empréstimo do nosso banco é de 178.500,50");
        }
        else if(valorSolicitado <= 500) {
            System.out.println("Valor do empréstimo abaixo do mínimo. O valor mínimo do empréstimo de nosso banco é 500,00");
        }
        else{
            System.out.println("Valor do empréstimo aceito");
        }
    }

    public void exibirConta(){
        System.out.println("Buscar conta");
        String buscarNome;
        System.out.println("Informe o nome da conta a ser buscada: ");
        buscarNome = sc.next();

        if(buscarNome.equals(getNome())) {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("N° da conta: " + getNumeroConta());
            System.out.println("Saldo: " + getSaldo());
        }
        else{
            System.out.println("Nome não encontrado");
        }
    }
}