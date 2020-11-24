package br.curso.java.aula.entity;

public class Laudo {
    private long idLaudo;
    private String texto;
    private Medico medico;
    private Atendimento atendimeto;

    public long getIdLaudo() {
        return idLaudo;
    }

    public void setIdLaudo(long idLaudo) {
        this.idLaudo = idLaudo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Atendimento getAtendimeto() {
        return atendimeto;
    }

    public void setAtendimeto(Atendimento atendimeto) {
        this.atendimeto = atendimeto;
    }
}
