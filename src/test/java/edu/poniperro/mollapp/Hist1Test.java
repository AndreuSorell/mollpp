package edu.poniperro.mollapp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.mollapp.domain.administrador.ProgramadorTasques;
import edu.poniperro.mollapp.domain.administrador.Tasques;
import edu.poniperro.mollapp.domain.clients.Mollapp;
import edu.poniperro.mollapp.domain.filtre.Autenticacio;
import edu.poniperro.mollapp.domain.filtre.Autoritzacio;
import edu.poniperro.mollapp.domain.filtre.Filtre;
import edu.poniperro.mollapp.domain.target.Vehicle;

public class Hist1Test {
    
    ProgramadorTasques programador = null;

    @Before
    public void setup() {
        programador = new ProgramadorTasques(new Vehicle());
    }
    
    @Test
    public void testConstructor() {
        assertEquals("programador de tasques llest", programador.toString());
    }

    @Test
    public void testAfegirTasques() {
        
        // tasques a afegir
        Filtre aute = new Autenticacio();
        Filtre auto = new Autoritzacio();

        // llista de tasques 
        List<Filtre> tasques = new ArrayList<>();
        tasques.add(aute);
        tasques.add(auto);
        
        // afegim les tasques desitjades
        programador.addTasca(aute);
        programador.addTasca(auto);
        
        // les tasques desitjades son iguals a les afegides
        assertEquals(tasques, programador.getTasques().getTasques());
    }

    @Test
    public void testMollapp() {
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTasques(programador);
        mollapp.enviarPeticio("Francesc");
    }
}
