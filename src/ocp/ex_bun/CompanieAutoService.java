package ocp.ex_bun;

import java.util.HashMap;
import java.util.Map;

public class CompanieAutoService {
    private Map<String, TaxaIntretinere> masini;

    public CompanieAutoService() {
        this.masini = new HashMap<>();
    }

    public void inregistreazaMasina(String nume, TaxaIntretinere masina) {
        masini.put(nume, masina);
    }

    public double calculeazaTaxa(String nume) {
        TaxaIntretinere masina = masini.get(nume);
        if (masina != null) {
            return masina.calculeazaTaxa();
        }
        return 0;
    }

    public double calculeazaTaxaTotala() {
        double total = 0;
        for (TaxaIntretinere masina : masini.values()) {
            total += masina.calculeazaTaxa();
        }
        return total;
    }

}
