package srp.ex_bun;

import java.util.ArrayList;
import java.util.List;

public class MedicamentService {

    private List<Medicament> medicamente;

    public MedicamentService(){
        this.medicamente = new ArrayList<>();
    }

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

    public boolean actualizeazaStoc(String nume, int nouStoc){
        for (Medicament m : medicamente){
            if (m.getNume().equalsIgnoreCase(nume)){
                m.setStoc(nouStoc);
                return true;
            }
        }
        return false;
    }

    public boolean stergeMedicament(String nume){
        return medicamente.removeIf(m -> m.getNume().equalsIgnoreCase(nume));
    }

    public List<Medicament> getToateMedicamentele(){
        return medicamente;
    }
}

