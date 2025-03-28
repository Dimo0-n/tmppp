package lid.ex_rau;

class SoferLivrari implements Angajat {
    @Override
    public void scaneazaProduse() {
        throw new UnsupportedOperationException("Șoferii nu scanează produse!");
    }

    @Override
    public void gestioneazaStoc() {
        throw new UnsupportedOperationException("Șoferii nu gestionează stocul!");
    }

    @Override
    public void livreazaProduse() {
        System.out.println("Șoferul livrează produsele la clienți");
    }

    @Override
    public void rezolvaReclamatiiClienti() {
        throw new UnsupportedOperationException("Șoferii nu rezolvă reclamații!");
    }

    @Override
    public void proceseazaPlati() {
        throw new UnsupportedOperationException("Șoferii nu procesează plăți!");
    }

    @Override
    public void curataMagazin() {
        throw new UnsupportedOperationException("Șoferii nu curăță magazinul!");
    }
}