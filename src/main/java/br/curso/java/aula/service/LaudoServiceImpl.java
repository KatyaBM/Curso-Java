package br.curso.java.aula.service;

import br.curso.java.aula.dao.LaudoDAO;
import br.curso.java.aula.dao.LaudoDAOImpl;
import br.curso.java.aula.entity.Laudo;

import java.util.List;

public class LaudoServiceImpl implements LaudoService {

    private LaudoDAO dao = new LaudoDAOImpl();

    @Override
    public List<Laudo> listar() {
        return dao.listar();
    }

    @Override
    public void cadastrar(Laudo laudo) {
        dao.cadastrar(laudo);
    }

    @Override
    public void editar(Laudo laudo) {
        dao.editar(laudo);
    }

    @Override
    public void deletar(long idLaudo) {
        dao.deletar(idLaudo);
    }

    @Override
    public Laudo listarPeloBy(long idLaudo) {
        return dao.listarPeloBy(idLaudo);
    }

    @Override
    public List<Laudo> listarPeloMedico(long idMedico) {
        return dao.listarPeloMedico(idMedico);
    }
}
