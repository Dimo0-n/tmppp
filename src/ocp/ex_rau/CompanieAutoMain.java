package ocp.ex_rau;

public class CompanieAutoMain {
    public static void main(String[] args) {
        CompanieAutoService companieService = new CompanieAutoService();

        Masina masina1 = new Masina("BMW", "X5", "standard", 50000);
        Masina masina2 = new Masina("Tesla", "Model S", "electrica", 80000);

        companieService.adaugaMasina(masina1);
        companieService.adaugaMasina(masina2);

        companieService.afiseazaToateMasinile();
    }
}