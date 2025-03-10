package ocp.ex_rau;

class Masina {
    private String marca;
    private String model;
    private String tip; // standard sau electrica
    private double pretBaza;

    public Masina(String marca, String model, String tip, double pretBaza) {
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.pretBaza = pretBaza;
    }

    public String getTip() {
        return tip;
    }

    public double getPretBaza() {
        return pretBaza;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }
}