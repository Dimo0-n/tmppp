package lid.ex_rau;

class Casier implements Angajat {
    @Override
    public void scaneazaProduse() {
        System.out.println("Casierul scanează produsele la casă");
    }

    @Override
    public void gestioneazaStoc() {
        throw new UnsupportedOperationException("Casierii nu gestionează stocul!");
    }

    @Override
    public void livreazaProduse() {
        throw new UnsupportedOperationException("Casierii nu livrează produse!");
    }

    @Override
    public void rezolvaReclamatiiClienti() {
        System.out.println("Casierul încearcă să rezolve o reclamație a clientului");
    }

    @Override
    public void proceseazaPlati() {
        System.out.println("Casierul procesează plata clientului");
    }

    @Override
    public void curataMagazin() {
        System.out.println("Casierul curăță zona sa de lucru");
    }
}