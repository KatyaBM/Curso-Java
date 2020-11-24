package br.curso.java.aula.dao;

import br.curso.java.aula.entity.Medico;

import java.util.List;

public interface MedicoDAO {
    public List<Medico> listaDeMedicos();

    public void cadastrar(Medico medico);
    public void deletar(long idMedico);
    public void editar(Medico medico);

    public Medico listarPeloBy(long idMedico);
}
