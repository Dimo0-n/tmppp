package srp.ex_rau;

import java.util.List;

public class FarmacieController {

    private FarmacieService farmacieService = new FarmacieService();

    public String adaugaFarmacie(Farmacie farmacie) {
        farmacieService.adaugaFarmacie(farmacie);
        return "Farmacia a fost adăugată cu succes!";
    }

    public String cautaFarmacie(String denumire) {
        List<Farmacie> farmaciiGasite = farmacieService.cautareFarmacie(denumire);
        if (farmaciiGasite == null) {
            return "Nu există farmacie cu acest nume!";
        }
        Farmacie f = farmaciiGasite.get(0);
        return "Farmacia " + f.getDenumire() + " are următoarele informații:\n" +
                "Adresa: " + f.getAdresa() + "\nTelefon: " + f.getTelefon() + "\nEmail: " + f.getEmail();
    }

    public void adaugaMedicament(Medicament medicament) {
        farmacieService.adaugaMedicament(medicament);
    }

    public void cautaMedicament(String nume) {
        Medicament m = farmacieService.cautaMedicament(nume);
        if (m != null) {
            System.out.println("Medicament găsit: " + m.getNume() +
                    "\nProducător: " + m.getProducator() +
                    "\nPreț: " + m.getPret() +
                    "\nStoc: " + m.getStoc());
        } else {
            System.out.println("Medicamentul nu a fost găsit.");
        }
    }

    public void calculeazaReducere(double pret, int procentReducere) {
        double pretFinal = farmacieService.calculeazaReducere(pret, procentReducere);
        System.out.println("Preț redus: " + pretFinal);
    }

    public void genereazaRaport() {
        farmacieService.genereazaRaportVanzari();
    }
}


