package edu.poniperro.mollapp.domain.administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import edu.poniperro.mollapp.domain.filtre.Filtre;
import edu.poniperro.mollapp.domain.target.Target;

public class Tasques {
    private List<Filtre> tasques = new ArrayList<Filtre>();
    private Optional<Target> target;
    
    public Tasques() {
    }

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void afegirTasca(Filtre tasca) {
        tasques.add(tasca);
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void execucio(String nomUsuari) {
        getTasques().forEach(tasca -> tasca.execucio(nomUsuari));
        if (getTarget().isPresent()) {
            getTarget().get().execucio(nomUsuari);
        } else {
            System.out.println("Cal afegir un target!");
        }
    }
}
