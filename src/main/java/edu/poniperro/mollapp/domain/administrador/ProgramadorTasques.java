package edu.poniperro.mollapp.domain.administrador;

import edu.poniperro.mollapp.domain.filtre.Filtre;
import edu.poniperro.mollapp.domain.target.Target;

public class ProgramadorTasques {
    private Tasques tasques = null;

    public ProgramadorTasques(Target target) {
        this.tasques = new Tasques();
        this.tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void addTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }
    
    public void executarTasques(String nomUsuari) {
        getTasques().execucio(nomUsuari);
    }

    @Override
    public String toString() {
        return "programador de tasques llest";
    }
    
}
