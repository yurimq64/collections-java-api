package main.java.list.operacoesbasicas;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Sabonete", 10.0f, 2);
    carrinho.exibirItens();
    }
}
