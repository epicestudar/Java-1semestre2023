package ProjetoFinalTestes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Banco extends Pessoa{
      Scanner sc = new Scanner(System.in);
    public double saldo;
    public int codigo = 0;
    public String contaTipo;
    public int senha;

        public Banco(String nome, int idade, double saldo, int codigo, String contaTipo) {
        super(nome, idade);
        this.saldo = saldo;
        this.codigo = codigo;
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
                    setSenha(Integer.parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
                    codigo++;
                    setContaTipo("Conta PF");
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Criação de Conta: Pessoa Jurídica");
                    setNome(JOptionPane.showInputDialog("Informe o nome da conta: "));
                    setSenha(Integer.parseInt(JOptionPane.showInputDialog("Informe a senha da conta (Apenas 6 digitos): ")));
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

    public void exibirConta(){
        /*JOptionPane.showMessageDialog(null,"Buscar Contas");*/ System.out.println("Buscar Contas");
        /*String buscarNome = JOptionPane.showInputDialog("Informe o nome da conta para ser buscado:");*/ System.out.println("Informe o nome da conta para ser buscado:");
        String buscarNome = sc.next();
        if (buscarNome.equals(getNome())){
            /*JOptionPane.showMessageDialog(null,"Nome: " + getNome());
            JOptionPane.showMessageDialog(null,"Idade: " + getIdade());
            JOptionPane.showMessageDialog(null,"Código: " + getCodigo());
            JOptionPane.showMessageDialog(null,"Tipo da conta: " + get);
            JOptionPane.showMessageDialog(null,"Saldo: " + getSaldo());*/
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Código: " + getCodigo());
            System.out.println("Saldo: " + getSaldo());           
        }
        else{
            JOptionPane.showMessageDialog(null,"Nome não encontrado.");
        }

    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
