package br.curso.java.aula.service;

import br.curso.java.aula.dao.AtendimentoDAO;
import br.curso.java.aula.dao.AtendimentoDAOImpl;
import br.curso.java.aula.entity.Atendimento;

import java.util.List;

public class AtendimentoServiceImpl implements AtendimentoService {

    private AtendimentoDAO dao = new AtendimentoDAOImpl();

    @Override
    public void cadastrar(Atendimento atendimento) {
        dao.cadastrar(atendimento);
    }

    @Override
    public void deletar(long idAtendimento) {
        dao.deletar(idAtendimento);
    }

    @Override
    public List<Atendimento> listar() {
        return dao.listar();
    }

    @Override
    public void editar(Atendimento atendimento) {
        dao.editar(atendimento);
    }

    @Override
    public Atendimento listarPeloBy(long idAtendimento) {
        return dao.listarPeloBy(idAtendimento);
    }
}

