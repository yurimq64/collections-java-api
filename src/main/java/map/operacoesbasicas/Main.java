package main.java.map.operacoesbasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("999583337", "Yuri");
        agendaContatos.adicionarContato("958674039", "Yuri");
        agendaContatos.adicionarContato("909324895", "Gustavo");

        System.out.println("Agenda de contatos:");
        agendaContatos.exibirContatos();
        System.out.println();
        System.out.println("Pesquisa por número de telefone:");
        System.out.println(agendaContatos.pesquisarPorNumero("999583337"));
        agendaContatos.removerContato("958674039");
        System.out.println();
        System.out.println("CONTATO REMOVIDO");
        System.out.println();
        System.out.println("Agenda de contatos:");
        agendaContatos.exibirContatos();
    }
}
