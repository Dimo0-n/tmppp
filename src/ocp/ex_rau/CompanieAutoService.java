package ocp.ex_rau;

import java.util.ArrayList;
import java.util.List;

class CompanieAutoService {
    private List<Masina> masini;

    public CompanieAutoService() {
        this.masini = new ArrayList<>();
    }

    public void adaugaMasina(Masina masina) {
        masini.add(masina);
    }

    public double calculeazaTaxa(Masina masina) {
        if (masina.getTip().equals("standard")) {
            return masina.getPretBaza() * 0.10;
        } else if (masina.getTip().equals("electrica")) {
            return masina.getPretBaza() * 0.05;
        }
        return 0;
    }

    public void afiseazaToateMasinile() {
        for (Masina masina : masini) {
            System.out.println("Masina: " + masina.getMarca() + " " + masina.getModel() + 
                               ", Tip: " + masina.getTip() + 
                               ", Taxa: " + calculeazaTaxa(masina));
        }
    }
}