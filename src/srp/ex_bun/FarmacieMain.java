package srp.ex_bun;

public class FarmacieMain {
    public static void main(String[] args) {

        FarmacieController farmacieController = new FarmacieController();

        Farmacie farmacie1 = new Farmacie("Farmacia Verde", "Strada Libertății 10", "+40755123456", "verde@farmacie.com");
        Farmacie farmacie2 = new Farmacie("Farmacia Albastră", "Strada Unirii 5", "+40766123456", "albastra@farmacie.com");

        System.out.println(farmacieController.adaugaFarmacie(farmacie1));
        System.out.println(farmacieController.adaugaFarmacie(farmacie2));

        Medicament medicament1 = new Medicament("Paracetamol", "Terapia", 15.99, 100);
        Medicament medicament2 = new Medicament("Ibuprofen", "Zentiva", 20.50, 50);

        farmacieController.adaugaMedicamentLaFarmacie("Farmacia Verde", medicament1);
        farmacieController.adaugaMedicamentLaFarmacie("Farmacia Verde", medicament2);

        farmacieController.afisareMedicamente();
    }
}

