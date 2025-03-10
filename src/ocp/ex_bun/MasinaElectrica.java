package ocp.ex_bun;

public class MasinaElectrica implements TaxaIntretinere {
    private double kilometraj;

    public MasinaElectrica(double kilometraj) {
        this.kilometraj = kilometraj;
    }

    @Override
    public double calculeazaTaxa() {
        return kilometraj * 0.05;
    }
}
