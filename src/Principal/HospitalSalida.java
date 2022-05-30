package Principal;

public class HospitalSalida {

    private String CIF;
    private String nombre;
    private String fechaEnvio;
    private String codigoEnvio;
    private int totalSinIva;
    private int totalConIva;
    private int bonificacion;
    private String[] codigoFactura;

    public HospitalSalida(String CIF, String nombre, String fechaEnvio, String codigoEnvio, int totalSinIva, int totalConIva, int bonificacion, String[] codigoFactura) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.fechaEnvio = fechaEnvio;
        this.codigoEnvio = codigoEnvio;
        this.totalSinIva = totalSinIva;
        this.totalConIva = totalConIva;
        this.bonificacion = bonificacion;
        this.codigoFactura = codigoFactura;
    }
}
