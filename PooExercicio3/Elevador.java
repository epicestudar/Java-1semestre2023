package PooExercicio3;

import java.util.Scanner;

public class Elevador {
    Scanner sc = new Scanner(System.in);
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int qtdPessoasAtual;

    // métodos
    // construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }

    //gets and sets
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQtdPessoasAtual() {
        return qtdPessoasAtual;
    }

    public void setQtdPessoasAtual(int qtdPessoasAtual) {
        this.qtdPessoasAtual = qtdPessoasAtual;
    }

    // métodos próprios
    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }

    public int entra(){
        if(qtdPessoasAtual<nMaxPessoas){
        qtdPessoasAtual++;
        } else{
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais pessoas");
        }
        return qtdPessoasAtual;
    }

    public int sair(){
        if(qtdPessoasAtual>0){
        qtdPessoasAtual--;
        } else{
            System.out.println("Não tem ninguém para descer");
        }
        return qtdPessoasAtual;
    }

    public int subir(int nAndares) {
        if(andarAtual + nAndares <= nMaxAndares){
            andarAtual+=nAndares;
        } else{
            System.out.println("Digite um n° válido para subir");
        }

        return andarAtual;
    }

    public int descer(int nAndares) {
        if(andarAtual - nAndares >= 0){
            andarAtual-=nAndares;
        } else{
            System.out.println("Digite um n° válido para descer");
        }

        return andarAtual;
    }
}
