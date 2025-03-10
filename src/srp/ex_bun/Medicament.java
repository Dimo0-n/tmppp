package srp.ex_bun;

public class Medicament {

    private String nume;
    private String producator;
    private double pret;
    private int stoc;

    public Medicament(String nume, String producator, double pret, int stoc) {
        this.nume = nume;
        this.producator = producator;
        this.pret = pret;
        this.stoc = stoc;
    }

    public Medicament() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

}

