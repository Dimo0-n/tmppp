package lid.ex_rau;

class ServiciuAngajati {
    public void executaToateSarcinile(Angajat angajat) {
        System.out.println("\nÎnceperea sarcinilor angajatului:");
        angajat.scaneazaProduse();
        angajat.gestioneazaStoc();
        angajat.livreazaProduse();
        angajat.rezolvaReclamatiiClienti();
        angajat.proceseazaPlati();
        angajat.curataMagazin();
    }
    
    public void genereazaRapoarte(Angajat angajat) {
        System.out.println("\nGenerarea rapoartelor:");
        if (angajat instanceof Casier) {
            System.out.println("Raport performanță casier");
        } else if (angajat instanceof SoferLivrari) {
            System.out.println("Raport livrări șofer");
        } else if (angajat instanceof Manager) {
            System.out.println("Raport magazin manager");
        } else {
            System.out.println("Raport generic angajat");
        }
    }
}