package br.curso.java.aula.dao;

import br.curso.java.aula.entity.Atendimento;
import br.curso.java.aula.entity.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoDAOImpl implements MedicoDAO{

    private List<Medico> listaDeMedicos;

    public MedicoDAOImpl(){
        listaDeMedicos = new ArrayList<Medico>();
    }

    public void cadastrar(Medico medico) {
        listaDeMedicos.add(medico);
    }

    public void deletar(long idMedico) {
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeMedicos.get(indice).getIdMedico() == idMedico){
                listaDeMedicos.remove(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    public List<Medico> listaDeMedicos() {
        return listaDeMedicos;
    }

    public void editar(Medico medico) {
        Medico aux = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            aux = listaDeMedicos.get(indice);
            if(aux.getIdMedico() == medico.getIdMedico()) {
                listaDeMedicos.remove(indice);
                listaDeMedicos.add(medico);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
    }

    public Medico listarPeloBy(long idMedico) {
        Medico medico = null;
        boolean encontrou = true;
        int indice = 0;
        do{
            if(listaDeMedicos.get(indice).getIdMedico() == idMedico){
                medico = listaDeMedicos.get(indice);
                encontrou = false;
            }
            indice++;
        }while(encontrou);
        return medico;
    }
}
