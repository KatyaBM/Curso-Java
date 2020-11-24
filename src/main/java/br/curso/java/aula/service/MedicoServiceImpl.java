package br.curso.java.aula.service;

import br.curso.java.aula.dao.MedicoDAO;
import br.curso.java.aula.dao.MedicoDAOImpl;
import br.curso.java.aula.entity.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoServiceImpl implements MedicoService {

    private MedicoDAO dao = new MedicoDAOImpl();

    @Override
    public List<Medico> listaDeMedicos() {
        return dao.listaDeMedicos();
    }

    @Override
    public void cadastrar(Medico medico){
        dao.cadastrar(medico);
    }

    @Override
    public void deletar(long idMedico) {
        dao.deletar(idMedico);
    }

    @Override
    public void editar(Medico medico) {
        dao.editar(medico);
    }

    @Override
    public Medico listarPeloBy(long idMedico) {
        return dao.listarPeloBy(idMedico);
    }
}

