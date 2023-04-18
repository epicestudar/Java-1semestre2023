package Operadores;

public class Operadores {
    public void aritimetico() {
        System.out.println("===============================");
        int adicao = 5 + 2;
        System.out.println("Resultado da adição de 5 com 2: " + adicao);
        int subtracao = 5 - 2;
        System.out.println("Resultado da subtração de 5 pelo 2: "

                + subtracao);
        int multiplicacao = 5 * 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: "

                + multiplicacao);
        double divisao = 5.0 / 2.0;
        System.out.println("Resultado da divisão de 5 pelo 2: " + divisao);
        double moduloOuResto = 5.0 % 2.0;
        System.out.println("Resto da divisão de 5 pelo 2: "

                + moduloOuResto);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void atribuicao() {
        System.out.println("===============================");
        int umNumero = 5;
        umNumero += 2;
        System.out.println("Resultado da adição de 5 com 2: " + umNumero);
        umNumero = 5; // Voltando o valor para 5.
        umNumero -= 2;
        System.out.println("Resultado da subtração de 5 pelo 2: "

                + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero *= 2;
        System.out.println("Resultado da multiplicação de 5 pelo 2: "

                + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero /= 2;
        System.out.println("Resultado da divisão de 5 pelo 2: "

                + umNumero);

        umNumero = 5; // Voltando o valor para 5.
        umNumero %= 2;
        System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void relacionais() {
        System.out.println("===============================");
        // Faça testes alterando o valor das duas variáveis abaixo.
        int primeiraVariavel = 1;
        int segundaVariavel = 1;
        System.out.println("O valor da primeira variável é "
                + primeiraVariavel + " e o da segunda é "
                + segundaVariavel + ".");
        boolean primeiraVariavelEMaiorQueASegunda = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variável é maior que a segunda? "
                + primeiraVariavelEMaiorQueASegunda);
        boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira variável é menor que a segunda? "
                + primeiraVariavelEMenorQueASegunda);
        boolean primeiraVariavelEMaiorIgualASegunda = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variável é maior ou igual a segunda? "
                + primeiraVariavelEMaiorIgualASegunda);
        boolean primeiraVariavelEMenorIgualASegunda = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variável é menor ou igual a segunda? "
                + primeiraVariavelEMenorIgualASegunda);
        boolean primeiraVariavelEIgualASegunda = primeiraVariavel == segundaVariavel;
        System.out.println("Primeira variável é igual a segunda? "
                + primeiraVariavelEIgualASegunda);
        boolean primeiraVariavelEDiferenteDaSegunda = primeiraVariavel != segundaVariavel;
        System.out.println("Primeira variável é diferente da segunda? "
                + primeiraVariavelEDiferenteDaSegunda);
        System.out.println("Fim!");
        System.out.println("===============================");
    }

    public void logicos() {
        System.out.println("===============================");
        // Faça testes alterando o valor das quatro variáveis abaixo.
        // Lembrando, elas podem ser true ou false.
        boolean usuarioVIP = true;
        boolean compraComValorAlto = true;
        boolean menorDeIdade = true;
        boolean temProdutoAlcoolicoNoCarrinho = true;
        System.out.println("Usuário é VIP? " + usuarioVIP);
        System.out.println("A compra tem um valor alto? "
                + compraComValorAlto);
        System.out.println("É menor de idade? " + menorDeIdade);
        System.out.println("Tem produto alcoólico no carrinho? "
                + temProdutoAlcoolicoNoCarrinho);
        System.out.println("===============================");
        boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? "
                + "(usuarioVIP && compraComValorAlto): "
                + aplicarDesconto);
        aplicarDesconto = usuarioVIP || compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? "
                + "(usuarioVIP || compraComValorAlto): "
                + aplicarDesconto);
        // Leia assim: "se não for menor de idade ou se
        // não tiver produto alcoólico".
        boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
        System.out.println("Pode concluir compra? "
                + "(!menorDeIdade || !temProdutoAlcoolicoNoCarrinho): "
                + permiteConcluirCompra);
        System.out.println("Fim!");
        System.out.println("===============================");
    }
}
