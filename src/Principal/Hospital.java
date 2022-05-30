package Principal;

import java.util.Arrays;
import java.util.Objects;

public class Hospital implements Comparable<Hospital> {
    private String CIF;
    private String nombreEmpresa;
    private String fechaEnvio;
    private String codigoEnvio;
    private Concepto[] conceptos;

    /**
     * Constructor de la clase Hospital, con todos los datos de las farmacias que nos envian al hospital
     *
     * @param CIF           Codigo de la empresa
     * @param nombreEmpresa String del nombre de la empresa
     * @param fechaEnvio    String con la fecha de envio
     * @param codigoEnvio   Codigo del envio de los farmacos
     * @param conceptos     Lista de la clase concepto que tiene como valores codigo de factura, importe sin iva e importe final
     */

    public Hospital(String CIF, String nombreEmpresa, String fechaEnvio, String codigoEnvio, Concepto[] conceptos) {
        this.CIF = CIF;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaEnvio = fechaEnvio;
        this.codigoEnvio = codigoEnvio;
        this.conceptos = conceptos;
    }

    @Override
    public String toString() {
        return CIF + ',' + nombreEmpresa + ',' +
                fechaEnvio + ',' + codigoEnvio + ','
                + Arrays.toString(conceptos) + "\n";
    }

    public String getCIF() {
        return CIF;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    @Override
    public int compareTo(Hospital o) {
        int valor = -1;
        if (this.CIF.compareTo(o.CIF) > 0 && this.nombreEmpresa.compareTo(o.nombreEmpresa) > 0 && this.fechaEnvio.compareTo(o.fechaEnvio) > 0) {
            valor = 1;
        }
        if (this.CIF == o.CIF && this.nombreEmpresa == o.nombreEmpresa && this.fechaEnvio == o.fechaEnvio) {
            valor = 0;
        }

        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(CIF, hospital.CIF) && Objects.equals(nombreEmpresa, hospital.nombreEmpresa) && Objects.equals(fechaEnvio, hospital.fechaEnvio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CIF, nombreEmpresa, fechaEnvio);
    }
}
