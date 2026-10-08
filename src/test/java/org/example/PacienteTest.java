package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente("Maria");
    }

    @Test
    public void deveMorrerPacienteVivo() {
        paciente.setEstado(PacienteEstadoVivo.getInstance());
        assertTrue(paciente.morrer());
        assertEquals(PacienteEstadoMorto.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveViverPacienteVivo() {
        paciente.setEstado(PacienteEstadoVivo.getInstance());
        assertFalse(paciente.viver());
    }

    @Test
    public void deveFicarInstavelPacienteVivo() {
        paciente.setEstado(PacienteEstadoVivo.getInstance());
        assertTrue(paciente.ficarInstavel());
        assertEquals(PacienteEstadoInstavel.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveFicarEstavelPacienteVivo() {
        paciente.setEstado(PacienteEstadoVivo.getInstance());
        assertTrue(paciente.ficarEstavel());
        assertEquals(PacienteEstadoEstavel.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveMorrerPacienteEstavel() {
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        assertTrue(paciente.morrer());
        assertEquals(PacienteEstadoMorto.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveViverPacienteEstavel() {
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        assertFalse(paciente.viver());
    }

    @Test
    public void naoDeveFicarInstavelPacienteEstavel() {
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        assertFalse(paciente.ficarInstavel());
    }

    @Test
    public void deveFicarEstavelPacienteEstavel() {
        paciente.setEstado(PacienteEstadoEstavel.getInstance());
        assertTrue(paciente.ficarEstavel());
        assertEquals(PacienteEstadoEstavel.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveMorrerPacienteInstavel() {
        paciente.setEstado(PacienteEstadoInstavel.getInstance());
        assertTrue(paciente.morrer());
        assertEquals(PacienteEstadoMorto.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveViverPacienteInstavel() {
        paciente.setEstado(PacienteEstadoInstavel.getInstance());
        assertFalse(paciente.viver());
    }

    @Test
    public void naoDeveFicarInstavelPacienteInstavel() {
        paciente.setEstado(PacienteEstadoInstavel.getInstance());
        assertFalse(paciente.ficarInstavel());
    }

    @Test
    public void deveFicarEstavelPacienteInstavel() {
        paciente.setEstado(PacienteEstadoInstavel.getInstance());
        assertTrue(paciente.ficarEstavel());
        assertEquals(PacienteEstadoEstavel.getInstance(), paciente.getEstado());
    }

    @Test
    public void naoDeveMorrerPacienteMorto() {
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        assertFalse(paciente.morrer());
    }

    @Test
    public void naoDeveViverPacienteMorto() {
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        assertFalse(paciente.viver());
    }

    @Test
    public void naoDeveFicarInstavelPacienteMorto() {
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        assertFalse(paciente.ficarInstavel());
    }

    @Test
    public void naoDeveFicarEstavelPacienteMorto() {
        paciente.setEstado(PacienteEstadoMorto.getInstance());
        assertFalse(paciente.ficarEstavel());
    }
}