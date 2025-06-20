package main.java.set.pesquisa;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Treinar");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.removerTarefa("Treinar");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaComoConcluida("Ler livro");
        listaTarefas.marcarTarefaComoConcluida("Estudar");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaComoPendente("Estudar");
        listaTarefas.exibirTarefas();

        listaTarefas.limparLista();
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
    }
}
