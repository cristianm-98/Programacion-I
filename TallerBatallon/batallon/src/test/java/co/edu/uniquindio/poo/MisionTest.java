package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class MisionTest {
    private static final Logger LOG = Logger.getLogger(MisionTest.class.getName());

    @Test
    public void agregarSoldadoTest() {
        LOG.info("Inicio de la prueba agregar Soldado");

        Mision mision = new Mision("001", LocalDate.of(2011, 11, 20), "Vietman");
        Soldado soldado = new Soldado("001", "Carlos Santa", 30, true, "Medico", Rango.SOLDADO);

        mision.agregarSoldado(soldado, mision);

        assertTrue(mision.getListaSoldados().contains(soldado));
        assertFalse(soldado.isDisponible());

        LOG.info("Fin de la prueba");
    }

    @Test
    public void cambiarEstadoTest() {
        LOG.info("Inicio de la prueba Estado");

        Mision mision = new Mision("001", LocalDate.of(2011, 11, 20), "Israel");
        Soldado soldado1 = new Soldado("001", "Mario Pedroza", 25, true, "Comunicaciones", Rango.SOLDADO);
        Soldado soldado2 = new Soldado("002", "Sebastian Ruiz", 23, true, "Medico", Rango.CABO);
        Soldado soldado3 = new Soldado("003", "Andres Restrepo", 35, true, "Logistico", Rango.SARGUENTO);

        mision.agregarSoldado(soldado1, mision);
        mision.agregarSoldado(soldado2, mision);
        mision.agregarSoldado(soldado3, mision);

        mision.cambiarEstado(mision);

        assertTrue(soldado1.isDisponible());
        assertTrue(soldado2.isDisponible());
        assertTrue(soldado3.isDisponible());

        LOG.info("Fin de la prueba Estado");
    }

    @Test
    public void buscarEspecialidadTest() {
        LOG.info("Inicio de la prueba de buscar Especialidad");

        Mision mision = new Mision("001", LocalDate.of(2011, 11, 20), "Israel");
        Soldado soldado4 = new Soldado("004", "Mario Pedroza", 25, true, "Comunicaciones", Rango.SOLDADO);
        Soldado soldado5 = new Soldado("005", "Sebastian Ruiz", 23, true, "Comunicaciones", Rango.CABO);
        Soldado soldado6 = new Soldado("006", "Andres Restrepo", 35, true, "Logistico", Rango.SARGUENTO);

        mision.agregarSoldado(soldado4, mision);
        mision.agregarSoldado(soldado5, mision);
        mision.agregarSoldado(soldado6, mision);

        LinkedList<Soldado> resultado = mision.buscarEspecialidad("Comunicaciones");

        for (Soldado soldado : resultado) {
            assertEquals("Comunicaciones", soldado.getFuncion());
        }
        assertEquals(2, resultado.size());

        assertNotNull(resultado);

        LOG.info("Fin de la prueba de buscar Especialidad ");
    }

    @Test
    public void soldadoRangoTest() {
        LOG.info("Inicio de la prueba soldado Rango");

        Mision mision = new Mision("001", LocalDate.of(2011, 11, 20), "Israel");
        Soldado soldado7 = new Soldado("004", "Mario Pedroza", 25, true, "Comunicaciones", Rango.SOLDADO);
        Soldado soldado8 = new Soldado("005", "Sebastian Ruiz", 23, true, "Comunicaciones", Rango.CABO);
        Soldado soldado9 = new Soldado("006", "Andres Restrepo", 35, true, "Logistico", Rango.SARGUENTO);

        mision.agregarSoldado(soldado7, mision);
        mision.agregarSoldado(soldado8, mision);
        mision.agregarSoldado(soldado9, mision);

        LinkedList<Soldado> soldadoEncontrado = mision.soldadoRango(Rango.SOLDADO, true);

        LinkedList<Soldado> listaEsperado = new LinkedList<>();
        listaEsperado.add(soldado7);

        assertEquals(listaEsperado,soldadoEncontrado);

        LOG.info("Fin de la prueba soldado Rango");
    }


}