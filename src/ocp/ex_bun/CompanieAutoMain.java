package ocp.ex_bun;

public class CompanieAutoMain {
    public static void main(String[] args) {
        CompanieAutoService companieService = new CompanieAutoService();

        MasinaStandard masina1 = new MasinaStandard(20000);
        MasinaElectrica masina2 = new MasinaElectrica(15000);

        companieService.inregistreazaMasina("BMW X5", masina1);
        companieService.inregistreazaMasina("Tesla Model 3", masina2);

        System.out.println("Taxa pentru BMW X5: " + companieService.calculeazaTaxa("BMW X5") + " lei");
        System.out.println("Taxa pentru Tesla Model 3: " + companieService.calculeazaTaxa("Tesla Model 3") + " lei");

        System.out.println("Taxa totală pentru toate mașinile: " + companieService.calculeazaTaxaTotala() + " lei");
    }
}
