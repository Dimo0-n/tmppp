package srp.ex_rau;

import java.util.ArrayList;
import java.util.List;

public class FarmacieService {

    private List<Farmacie> farmacii;
    private List<Medicament> medicamente;

    public FarmacieService(){
        this.farmacii = new ArrayList<>();
        this.medicamente = new ArrayList<>();
    }

    public void adaugaFarmacie(Farmacie farmacie){
        this.farmacii.add(farmacie);
    }

    public List<Farmacie> cautareFarmacie(String denumire){
        for (Farmacie f : this.farmacii){
            if (f.getDenumire().equalsIgnoreCase(denumire)){
                List<Farmacie> rezultat = new ArrayList<>();
                rezultat.add(f);
                return rezultat;
            }
        }
        return null;
    }

    public List<Farmacie> afisareaToateFarmacii(){
        return this.farmacii;
    }

    ////////////////////////////////////////////
    public void adaugaMedicament(Medicament medicament){
        this.medicamente.add(medicament);
    }

    public Medicament cautaMedicament(String nume){
        for (Medicament m : medicamente){
            if (m.getNume().equalsIgnoreCase(nume)){
                return m;
            }
        }
        return null;
    }

    public boolean stergeMedicament(String nume){
        return medicamente.removeIf(m -> m.getNume().equalsIgnoreCase(nume));
    }

    public double calculeazaReducere(double pret, int procentReducere){
        return pret - (pret * procentReducere / 100);
    }

    public void genereazaRaportVanzari(){
        System.out.println("Generare raport vânzări...");
    }
}
