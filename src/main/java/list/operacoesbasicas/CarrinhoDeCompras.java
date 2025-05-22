package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, float preco, int quantidade) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            carrinho.removeAll(itensParaRemover);
        }
        System.out.println("O carrinho está vazio!");
    }

    public float calcularValorTotal() {
        float valorTotal = 0.0f;
        for (Item item : carrinho) {
            float valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
    return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
