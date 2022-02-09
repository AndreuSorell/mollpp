package edu.poniperro.mollapp.domain.clients;

import edu.poniperro.mollapp.domain.administrador.ProgramadorTasques;

public class Mollapp implements Client {

    private ProgramadorTasques programador = null;

    public Mollapp() {
        
    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String nomUsuari) {
        programador.executarTasques(nomUsuari);
    }

}
