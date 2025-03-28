package lid.ex_rau;

class Manager implements Angajat {
    @Override
    public void scaneazaProduse() {
        System.out.println("Managerul scanează produse pentru a ajuta la nevoie");
    }

    @Override
    public void gestioneazaStoc() {
        System.out.println("Managerul gestionează stocul magazinului");
    }

    @Override
    public void livreazaProduse() {
        System.out.println("Managerul livrează produse în caz de urgență");
    }

    @Override
    public void rezolvaReclamatiiClienti() {
        System.out.println("Managerul rezolvă o reclamație serioasă a unui client");
    }

    @Override
    public void proceseazaPlati() {
        System.out.println("Managerul procesează plăți când sistemul este indisponibil");
    }

    @Override
    public void curataMagazin() {
        throw new UnsupportedOperationException("Managerii nu curăță magazinul!");
    }
}