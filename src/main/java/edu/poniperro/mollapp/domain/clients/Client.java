package edu.poniperro.mollapp.domain.clients;

import edu.poniperro.mollapp.domain.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques programador);

    void enviarPeticio(String nomUsuari);
}
