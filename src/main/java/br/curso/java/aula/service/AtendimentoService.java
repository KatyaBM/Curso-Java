package br.curso.java.aula.service;

import br.curso.java.aula.entity.Atendimento;

import java.util.List;

public interface AtendimentoService {
    public List<Atendimento> listar();

    public void cadastrar(Atendimento atendimento);
    public void deletar(long idAtendimento);
    public void editar(Atendimento atendimento);

    public Atendimento listarPeloBy(long idAtendimento);
}
