package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, String> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String numeroTelefone, String nome) {
        agendaContatos.put(numeroTelefone, nome);
    }

    public void removerContato(String telefone) {
        agendaContatos.remove(telefone);
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public String pesquisarPorNumero(String numero) {
        return agendaContatos.get(numero);
    }
}
