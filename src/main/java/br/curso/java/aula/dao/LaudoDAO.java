package br.curso.java.aula.dao;

import br.curso.java.aula.entity.Laudo;

import java.util.List;

public interface LaudoDAO {
    public List<Laudo> listar();

    public void cadastrar(Laudo laudo);
    public void editar(Laudo laudo);
    public void deletar(long idLaudo);

    public Laudo listarPeloBy(long idLaudo);

    public List<Laudo> listarPeloMedico(long idMedico);
}
