package br.curso.java.aula.dao;

import br.curso.java.aula.entity.Atendimento;

import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAOImpl implements AtendimentoDAO{

    private List<Atendimento> listaDeAtendimentos = new ArrayList<Atendimento>();

    @Override
    public List<Atendimento> listar() {
        return listaDeAtendimentos;
    }

    @Override
    public void cadastrar(Atendimento atendimento) {
        listaDeAtendimentos.add(atendimento);
    }

    @Override
    public void deletar(long idAtendimento) {
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeAtendimentos.get(indice).getIdAtendimento() == idAtendimento){
                listaDeAtendimentos.remove(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    @Override
    public void editar(Atendimento atendimento) {
        Atendimento aux = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            aux = listaDeAtendimentos.get(indice);
            if(aux.getIdAtendimento() == atendimento.getIdAtendimento()) {
                listaDeAtendimentos.remove(indice);
                listaDeAtendimentos.add(atendimento);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    @Override
    public Atendimento listarPeloBy(long idAtendimento) {
        Atendimento retornoAtendimento = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeAtendimentos.get(indice).getIdAtendimento() == idAtendimento){
                retornoAtendimento = listaDeAtendimentos.get(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
        return retornoAtendimento;
    }
}
