package br.curso.java.aula;

import br.curso.java.aula.entity.Atendimento;
import br.curso.java.aula.entity.Medico;
import br.curso.java.aula.service.AtendimentoService;
import br.curso.java.aula.service.AtendimentoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AtendimentoTest {
    private AtendimentoService atendimentoService;

    @Before
    public void init() {
        atendimentoService = new AtendimentoServiceImpl();
    }

    @Test
    public void cadastrar() {

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(123);
        atendimento.setNomeProcedimento("Procedimento teste");
        atendimentoService.cadastrar(atendimento);
        Assert.assertEquals(1, atendimentoService.listar().size());
        atendimentoService.listar().clear();
    }

    @Test
    public void listar() {
        Atendimento atendimento = new Atendimento();
        atendimento.setNomeProcedimento("Raio X");

        Atendimento atendimento2 = new Atendimento();
        atendimento2.setNomeProcedimento("Ultrassom");

        atendimentoService.cadastrar(atendimento);
        atendimentoService.cadastrar(atendimento2);

        assertEquals(2, atendimentoService.listar().size());

        atendimentoService.listar().clear();
    }

    @Test
    public void editar() {

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(123);
        atendimento.setNomeProcedimento("Raio X");

        atendimentoService.cadastrar(atendimento);

        Atendimento atendimentoPesquisado = atendimentoService.listarPeloBy(123);
        atendimentoPesquisado.setNomeProcedimento("Ultrassom");
        atendimentoService.editar(atendimentoPesquisado);

        Atendimento atendimentoEditado = atendimentoService.listarPeloBy(123);

        assertEquals("Ultrassom", atendimentoEditado.getNomeProcedimento());

        atendimentoService.listar().clear();
    }

    @Test
    public void deletar() {

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(123);
        atendimento.setNomeProcedimento("USG");

        atendimentoService.cadastrar(atendimento);
        atendimentoService.deletar(123);

        assertEquals(0, atendimentoService.listar().size());

        atendimentoService.listar().clear();
    }

    @Test
    public void listarPeloBy() {

        Atendimento atendimento = new Atendimento();
        atendimento.setIdAtendimento(123);
        atendimento.setNomeProcedimento("Raio X");

        atendimentoService.cadastrar(atendimento);

        assertNotNull(atendimentoService.listarPeloBy(123));
    }
}