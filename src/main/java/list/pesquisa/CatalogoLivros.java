package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            } return livrosPorAutor;
        } return null;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(livro);
                }
            } return livrosPorIntervalo;
        } return null;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo.add(livro);
                }
            } return livrosPorTitulo;
        } return null;
    }
}
