package lid.ex_rau;

class ControllerAngajati {
    private ServiciuAngajati serviciuAngajati;
    
    // Încălcă DIP prin dependența de serviciu concret
    public ControllerAngajati() {
        this.serviciuAngajati = new ServiciuAngajati();
    }
    
    public void gestioneazaAngajat(Angajat angajat) {
        try {
            serviciuAngajati.executaToateSarcinile(angajat);
            serviciuAngajati.genereazaRapoarte(angajat);
        } catch (Exception e) {
            System.out.println("Eroare la gestionarea angajatului: " + e.getMessage());
        }
    }
}