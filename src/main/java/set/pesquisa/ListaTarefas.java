package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada");
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        listaTarefas.remove(tarefaParaRemover);
        System.out.println("Tarefa removida");
    }

    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaComoConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                return;
            }
        }
    }

    public void marcarTarefaComoPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                return;
            }
        }
    }
    public void limparLista() {
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista já está vazia");
        } else {
            listaTarefas.clear();
            System.out.println("A lista foi esvaziada");
        }
    }
}
