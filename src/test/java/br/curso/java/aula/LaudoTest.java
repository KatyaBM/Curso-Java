package br.curso.java.aula;

import br.curso.java.aula.entity.Laudo;
import br.curso.java.aula.entity.Medico;
import br.curso.java.aula.service.LaudoService;
import br.curso.java.aula.service.LaudoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LaudoTest {

    private LaudoService laudoService;

    @Before
    public void init() {
        laudoService = new LaudoServiceImpl();
    }

    @Test
    public void cadastrar() {

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(123);
        laudo.setTexto("Pe quebrado");

        laudoService.cadastrar(laudo);

        Assert.assertEquals(1, laudoService.listar().size());

        laudoService.listar().clear();
    }

    @Test
    public void listar(){
        Laudo laudo = new Laudo();
        laudo.setTexto("Pe quebrado");

        Laudo laudoB = new Laudo();
        laudoB.setTexto("Pe torcido");

        laudoService.cadastrar(laudo);
        laudoService.cadastrar(laudoB);

        Assert.assertEquals(2, laudoService.listar().size());

        laudoService.listar().clear();
    }

    @Test
    public void editar() {

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(123);
        laudo.setTexto("Pe quebrado");

        laudoService.cadastrar(laudo);

        Laudo atendimentoPesquisado = laudoService.listarPeloBy(123);
        atendimentoPesquisado.setTexto("Pe torcido");
        laudoService.editar(atendimentoPesquisado);

        Laudo atendimentoEditado = laudoService.listarPeloBy(123);

        Assert.assertEquals("Pe torcido", atendimentoEditado.getTexto());

        laudoService.listar().clear();
    }

    @Test
    public void deletar() {

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(123);
        laudo.setTexto("Pe quebrado");

        laudoService.cadastrar(laudo);
        laudoService.deletar(123);

        Assert.assertEquals(0, laudoService.listar().size());

        laudoService.listar().clear();
    }

    @Test
    public void listarPeloBy() {

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(123);
        laudo.setTexto("Pe torcido");

        laudoService.cadastrar(laudo);

        Assert.assertNotNull(laudoService.listarPeloBy(123));
    }

    @Test
    public void listarLaudosPeloIdMedico() {

        Medico medicoA = new Medico();
        medicoA.setIdMedico(1234);
        medicoA.setNome("Dr. Joao");

        Medico medicoB = new Medico();
        medicoB.setIdMedico(12345);
        medicoB.setNome("Dr. Maria");

        Laudo laudo = new Laudo();
        laudo.setIdLaudo(12);
        laudo.setTexto("Pe Quebrado");
        laudo.setMedico(medicoA);

        laudoService.cadastrar(laudo);
        List<Laudo> listaParaTeste = new ArrayList<Laudo>();

        listaParaTeste = laudoService.listarPeloMedico(1234);

        Assert.assertEquals(0, listaParaTeste.size());
    }
}
