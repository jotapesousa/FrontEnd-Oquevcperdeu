package br.ufrn.imd.web.mbean;

import br.ufrn.imd.dao.DelegaciaDao;
import br.ufrn.imd.dao.ObjetoDao;
import br.ufrn.imd.dao.UsuarioDao;
import br.ufrn.imd.dominio.*;
import br.ufrn.imd.sbean.ObjetoSBInterface;
import br.ufrn.imd.util.OpcaoSelect;


import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class ObjetoMB implements Serializable {

    @EJB
    private ObjetoSBInterface objetoSB;

    private Part foto;

    private Objeto objeto = new Objeto();



    public void salvar(){
        objetoSB.salvar(this.objeto);
        objeto = new Objeto();
    }

    public List<Objeto> listar() { return objetoSB.listar(); }

    public void editar(Long id) { this.objetoSB.editar(id); }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public List<OpcaoSelect> selectStatus(){
        return StatusObjeto.retornarOpcaoSelect();
    }

    public List<OpcaoSelect> selectTipoObjeto(){
        return TipoObjeto.retornarOpcaoSelect();
    }

    public List<OpcaoSelect> selectCondicaoObjeto(){
        return CondicaoObjeto.retornarOpcaoSelect();
    }

    public ObjetoSBInterface getObjetoSB() {
        return objetoSB;
    }

    public void setObjetoSB(ObjetoSBInterface objetoSB) {
        this.objetoSB = objetoSB;
    }

    public Part getFoto() {
        return foto;
    }

    public void setFoto(Part foto) {
        this.foto = foto;
    }
}
