package br.curso.java.aula.dao;

import br.curso.java.aula.entity.Atendimento;
import br.curso.java.aula.entity.Laudo;

import java.util.ArrayList;
import java.util.List;

public class LaudoDAOImpl implements LaudoDAO{

    private List<Laudo> listaDeLaudos = new ArrayList<Laudo>();

    @Override
    public List<Laudo> listar() {
        return listaDeLaudos;
    }

    @Override
    public void cadastrar(Laudo laudo) {
        listaDeLaudos.add(laudo);
    }

    @Override
    public void editar(Laudo laudo) {
        Laudo aux = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            aux = listaDeLaudos.get(indice);
            if(aux.getIdLaudo() == laudo.getIdLaudo()) {
                listaDeLaudos.remove(indice);
                listaDeLaudos.add(laudo);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    @Override
    public void deletar(long idLaudo) {
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeLaudos.get(indice).getIdLaudo() == idLaudo){
                listaDeLaudos.remove(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    @Override
    public Laudo listarPeloBy(long idLaudo) {
        Laudo laudo = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeLaudos.get(indice).getIdLaudo() == idLaudo){
                laudo = listaDeLaudos.get(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
        return laudo;
    }

    @Override
    public List<Laudo> listarPeloMedico(long idMedico) {
        List<Laudo> listaMedico = new ArrayList<Laudo>();
        for(Laudo aux: listaMedico){
            if(aux.getMedico().getIdMedico() == idMedico){
                listaMedico.add(aux);
            }
        }
        return listaMedico;
    }
}
