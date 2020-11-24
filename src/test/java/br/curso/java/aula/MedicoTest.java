package br.curso.java.aula;

import br.curso.java.aula.entity.Medico;
import br.curso.java.aula.service.MedicoService;
import br.curso.java.aula.service.MedicoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedicoTest {

    private MedicoService medicoService;

    @Before
    public void init() {
        medicoService = new MedicoServiceImpl();
    }

    @Test
    public void cadastrar() {

        Medico medico = new Medico();
        medico.setIdMedico(123);
        medico.setNome("Dr. Joao");

        medicoService.cadastrar(medico);

        Assert.assertEquals(1, medicoService.listaDeMedicos().size());

        medicoService.listaDeMedicos().clear();
    }

    @Test
    public void listar(){
        
        Medico medico = new Medico();
        medico.setNome("Dr. Joao");

        Medico medico1 = new Medico();
        medico1.setNome("Dra. Maria");

        medicoService.cadastrar(medico);
        medicoService.cadastrar(medico1);

        Assert.assertEquals(2, medicoService.listaDeMedicos().size());

        medicoService.listaDeMedicos().clear();
    }

    @Test
    public void editar() {

        Medico medico = new Medico();
        medico.setIdMedico(1234);
        medico.setNome("Dr. Joao");

        medicoService.cadastrar(medico);

        Medico atendimentoPesquisado = medicoService.listarPeloBy(1234);
        atendimentoPesquisado.setNome("Dra. Maria");
        medicoService.editar(atendimentoPesquisado);

        Medico atendimentoEditado = medicoService.listarPeloBy(1234);

        Assert.assertEquals("Dra. Maria", atendimentoEditado.getNome());

        medicoService.listaDeMedicos().clear();
    }

   @Test
    public void deletar() {

        Medico medico = new Medico();
        medico.setIdMedico(1234);
        medico.setNome("Dr. Joao");

        medicoService.cadastrar(medico);
        medicoService.deletar(1234);

        Assert.assertEquals(0, medicoService.listaDeMedicos().size());

        medicoService.listaDeMedicos().clear();
    }

    @Test
    public void listarPeloBy() {

        Medico medico = new Medico();
        medico.setIdMedico(1234);
        medico.setNome("Dr. Joao");

        medicoService.cadastrar(medico);

        Assert.assertNotNull(medicoService.listarPeloBy(1234));
    }
}
