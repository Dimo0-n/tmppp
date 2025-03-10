package srp.ex_rau;

public class FarmacieMain {
    public static void main(String[] args) {

        FarmacieController farmacieController = new FarmacieController();

        Farmacie farmacie1 = new Farmacie("Farmacia Verde", "Strada Libertății 10", "+40755123456", "verde@farmacie.com");
        System.out.println(farmacieController.adaugaFarmacie(farmacie1));

        Medicament medicament1 = new Medicament("Paracetamol", "Terapia", 15.99, 100);
        farmacieController.adaugaMedicament(medicament1);

        farmacieController.cautaMedicament("Paracetamol");

        farmacieController.calculeazaReducere(100, 10);

        farmacieController.genereazaRaport();
    }
}

