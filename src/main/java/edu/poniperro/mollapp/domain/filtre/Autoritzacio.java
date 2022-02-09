package edu.poniperro.mollapp.domain.filtre;

public class Autoritzacio implements Filtre {

    @Override
    public void execucio(String nomUsuari) {
        System.out.println("Autorización OK para " + nomUsuari);
    }
    
    
}
