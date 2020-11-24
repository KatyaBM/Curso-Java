package br.curso.java.aula.entity;

import java.util.Date;

public class Atendimento {
    private long idAtendimento;
    private Date dataHora;
    private String nomeProcedimento;
    private String modalidade;
    private Medico medico;
    private String paciente;

    public long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcediento) {
        this.nomeProcedimento = nomeProcediento;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
}

