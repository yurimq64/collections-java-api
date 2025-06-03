package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<String, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(String codigo, String nome, double preco, int quantidade) {
        estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void removerProduto(String codigo) {
        estoqueProdutos.remove(codigo);
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        for (Produto produto : estoqueProdutos.values()) {
            valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutos.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutos.values()) {
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorValorEstoque() {
        Produto produtoMaiorValorEstoque = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutos.values()) {
            double valorProduto = produto.getQuantidade() * produto.getPreco();
            if (valorProduto > maiorValor) {
                maiorValor = valorProduto;
                produtoMaiorValorEstoque = produto;
            }
        }
        return produtoMaiorValorEstoque;
    }
}
