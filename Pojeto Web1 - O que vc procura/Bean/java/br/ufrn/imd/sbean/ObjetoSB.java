package br.ufrn.imd.sbean;

import br.ufrn.imd.dao.ObjetoDao;
import br.ufrn.imd.dominio.Objeto;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local
@Stateless
public class ObjetoSB implements ObjetoSBInterface {

    @Inject
    private ObjetoDao objetoDao;

    @Override
    public Objeto salvar(Objeto objeto) {
        Objeto obj = objetoDao.salvar(objeto);
        return obj;
    }

    @Override
    public Objeto editar(Long id) {
        Objeto obj = objetoDao.buscarPorId(id);
        return obj;
    }

    @Override
    public List<Objeto> listar() {
        return objetoDao.todos();
    }

    @Override
    public void remover(Objeto objeto) {
        objetoDao.remover(objeto);
    }
}
