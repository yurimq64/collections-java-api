package main.java.list.pesquisa;

public class Main {
    public static void main(String[] args) {
        SomaNumeros minhaSoma = new SomaNumeros();

        minhaSoma.adicionarNumero(0);
        minhaSoma.adicionarNumero(6);
        minhaSoma.adicionarNumero(4);
        minhaSoma.adicionarNumero(-12);

        minhaSoma.exibirNumeros();

        System.out.println(minhaSoma.calcularSoma());

        System.out.println(minhaSoma.encontrarMaiorNumero());

        System.out.println(minhaSoma.encontrarMenorNumero());


        CatalogoLivros meuCatalogo = new CatalogoLivros();

        meuCatalogo.adicionarLivro("Clean Code", "Robert Martin", 2008);
        meuCatalogo.adicionarLivro("1984", "George Orwell", 1949);
        meuCatalogo.adicionarLivro("A revolução dos bichos", "George Orwell", 1945);

        System.out.println(meuCatalogo.pesquisarPorAutor("George Orwell"));
        System.out.println(meuCatalogo.pesquisarPorTitulo("Clean Code"));
        System.out.println(meuCatalogo.pesquisarPorIntervaloAnos(1901, 2025));
    }
}
