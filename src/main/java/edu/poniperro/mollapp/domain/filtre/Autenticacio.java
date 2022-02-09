package edu.poniperro.mollapp.domain.filtre;

public class Autenticacio implements Filtre {

    @Override
    public void execucio(String nomUsuari) {
        System.out.println("Autenticación OK para " + nomUsuari);
    }
    
}
