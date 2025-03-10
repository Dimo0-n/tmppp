package srp.ex_bun;

import java.util.ArrayList;
import java.util.List;

public class FarmacieService {

    private List<Farmacie> farmacii;
    private MedicamentService medicamentService;

    public FarmacieService(){
        this.farmacii = new ArrayList<>();
        this.medicamentService = new MedicamentService();
    }

    public void adaugaFarmacie(Farmacie farmacie){
        this.farmacii.add(farmacie);
    }

    public List<Farmacie> cautareFarmacie(String denumire){
        List<Farmacie> rezultat = new ArrayList<>();
        for (Farmacie f : this.farmacii){
            if (f.getDenumire().equalsIgnoreCase(denumire)){
                rezultat.add(f);
            }
        }
        return rezultat;
    }

    public List<Farmacie> afisareaToateFarmacii(){
        return this.farmacii;
    }

    // Metode legate de medicamente
    public void adaugaMedicamentLaFarmacie(String denumireFarmacie, Medicament medicament){
        if (cautareFarmacie(denumireFarmacie).isEmpty()) {
            System.out.println("Farmacia nu există!");
            return;
        }
        medicamentService.adaugaMedicament(medicament);
        System.out.println("Medicament adăugat în farmacia " + denumireFarmacie);
    }

    public List<Medicament> afisareMedicamente(){
        return medicamentService.getToateMedicamentele();
    }
}

