package srp.ex_bun;

import java.util.List;

public class FarmacieController {

    private FarmacieService farmacieService = new FarmacieService();

    public String adaugaFarmacie(Farmacie farmacie) {
        farmacieService.adaugaFarmacie(farmacie);
        return "Farmacia a fost adăugată cu succes!";
    }

    public String cautaFarmacie(String denumire) {
        List<Farmacie> farmaciiGasite = farmacieService.cautareFarmacie(denumire);
        if (farmaciiGasite.isEmpty()) {
            return "Nu există farmacie cu acest nume!";
        }
        Farmacie f = farmaciiGasite.get(0);
        return "Farmacia " + f.getDenumire() + " are următoarele informații:\n" +
                "Adresa: " + f.getAdresa() + "\nTelefon: " + f.getTelefon() + "\nEmail: " + f.getEmail();
    }

    public void afisareMedicamente() {
        System.out.println("Lista medicamentelor:");
        farmacieService.afisareMedicamente().forEach(m ->
                System.out.println("Medicament: " + m.getNume() +
                        "\nProducător: " + m.getProducator() +
                        "\nPreț: " + m.getPret() +
                        "\nStoc: " + m.getStoc()
                ));
    }

    public void adaugaMedicamentLaFarmacie(String denumireFarmacie, Medicament medicament) {
        farmacieService.adaugaMedicamentLaFarmacie(denumireFarmacie, medicament);
    }
}

