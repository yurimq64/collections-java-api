package main.java.map.pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto("1234", "Panela", 149.9d, 70);
        estoqueProdutos.adicionarProduto("1235", "Copo", 19.9d, 20);
        estoqueProdutos.adicionarProduto("1236", "Prato", 49.9d, 60);
        estoqueProdutos.adicionarProduto("1237", "Garfo", 8.9d, 350);
        estoqueProdutos.adicionarProduto("1238", "Faca", 8.9d, 350);
        estoqueProdutos.adicionarProduto("1239", "Colher", 8.9d, 350);
        estoqueProdutos.adicionarProduto("1240", "Kit Talheres", 129.9d, 100);

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println();
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println();
        System.out.println(estoqueProdutos.obterProdutoMaiorValorEstoque());
    }
}
