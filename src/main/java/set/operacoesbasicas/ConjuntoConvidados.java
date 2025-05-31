package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : conjuntoConvidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        conjuntoConvidados.remove(convidadoParaRemover);
    }

    public void contarConvidados() {
        System.out.println(conjuntoConvidados.size());
    }

    public void exibirConvidados() {
        System.out.println(conjuntoConvidados);
    }

    public void exibirConvidadosPorNome(String nome) {
        Set<Convidado> convidadosPorNome = new HashSet<>();
        for (Convidado convidado : conjuntoConvidados) {
            if (convidado.getNome().equalsIgnoreCase(nome)) {
                convidadosPorNome.add(convidado);
            }
        }
        System.out.println(convidadosPorNome);
    }

    public void verificarConvidadoPorCodigoConvite(int codigoConvite) {
        boolean encontrado = false;
        for (Convidado convidado : conjuntoConvidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado);
    }
}
