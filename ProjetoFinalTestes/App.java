package ProjetoFinalTestes;

import java.util.jar.Manifest;

import ProjetoFinalSemestre.Conta;

public class App {
     public static void main(String[] args) {
        Banco objConta = new Banco("Pedrinho",21,0,1,"Conta PF");

        
        objConta.exibirConta();
    }
}
