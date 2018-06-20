package br.ufrn.imd.sbean;

import br.ufrn.imd.dominio.Objeto;

import java.util.List;

public interface ObjetoSBInterface {

    Objeto salvar(Objeto objeto);
    List<Objeto> listar();
    void remover(Objeto objeto);

    Objeto editar(Long id);
}
