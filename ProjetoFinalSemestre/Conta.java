package ProjetoFinalSemestre;
public class Conta extends Pessoa{

    public Conta(String nome, int idade, int numeroConta) {
        super(nome, idade, numeroConta);
    }
    
    double saldo;
    double saque;
    double deposito;
    double emprestimo;
    String PF;
    String PJ;

    public Conta(String nome, int idade, int numeroConta, double saldo, double saque, double deposito,
            double emprestimo, String pF, String pJ) {
        super(nome, idade, numeroConta);
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
        this.emprestimo = emprestimo;
        PF = pF;
        PJ = pJ;
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
    public String getPF() {
        return PF;
    }
    public void setPF(String pF) {
        PF = pF;
    }
    public String getPJ() {
        return PJ;
    }
    public void setPJ(String pJ) {
        PJ = pJ;
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
}