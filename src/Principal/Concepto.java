package Principal;

public class Concepto {
    private String codigoFactura;
    private double importeSinIva;
    private double importeTotal;

    public Concepto(String codigoFactura, double importeSinIva, double importeTotal) {
        this.codigoFactura = codigoFactura;
        this.importeSinIva = importeSinIva;
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return codigoFactura + ',' + importeSinIva + ','
                + importeTotal;
    }

}
