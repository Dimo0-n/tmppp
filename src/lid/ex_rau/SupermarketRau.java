package lid.ex_rau;

public class SupermarketRau {
    public static void main(String[] args) {
        ControllerAngajati controller = new ControllerAngajati();
        
        System.out.println("=== Gestionare Casier ===");
        Angajat casier = new Casier();
        controller.gestioneazaAngajat(casier);
        
        System.out.println("\n=== Gestionare Șofer Livrări ===");
        Angajat sofer = new SoferLivrari();
        controller.gestioneazaAngajat(sofer);
        
        System.out.println("\n=== Gestionare Manager ===");
        Angajat manager = new Manager();
        controller.gestioneazaAngajat(manager);
    }
}