package edu.poniperro.mollapp;

import edu.poniperro.mollapp.domain.administrador.ProgramadorTasques;
import edu.poniperro.mollapp.domain.clients.Mollapp;
import edu.poniperro.mollapp.domain.filtre.Autenticacio;
import edu.poniperro.mollapp.domain.filtre.Autoritzacio;
import edu.poniperro.mollapp.domain.target.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        ProgramadorTasques programadorTasques = new ProgramadorTasques(new Vehicle());
        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programadorTasques.addTasca(new Autenticacio());
        programadorTasques.addTasca(new Autoritzacio());

        
        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgramadorTasques(programadorTasques);
        mollapp.enviarPeticio("Francesc");
    }


}
