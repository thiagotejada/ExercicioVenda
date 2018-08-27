package pucrs.progoo;

import java.util.ArrayList;

public class CadastroPessoas {
    ArrayList<Pessoa> lista;

    public CadastroPessoas() {
        lista = new ArrayList<>();
    }

    public void inserir(Pessoa p) {
        lista.add(p);
    }

    public Pessoa pesquisar(String cod) {
        for (Pessoa p: lista) {
            if (p.getCpf() == cod)
                return p;
        }
        return null;

    }
}
