package ocp.ex_bun;

public class MasinaStandard implements TaxaIntretinere {
    private double kilometraj;

    public MasinaStandard(double kilometraj) {
        this.kilometraj = kilometraj;
    }

    @Override
    public double calculeazaTaxa() {
        return kilometraj * 0.1;
    }
}
