/*
 */
package org.decomisims.modelo;

import java.io.Serializable;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class RamoISR implements Serializable {

    private String nombre;
    private Double pcPatron;
    private Double pcAsegurado;
    private Double patron;
    private Double asegurado;
    private Double pcSuma;
    private Double suma;

    public RamoISR() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPcPatron() {
        return pcPatron;
    }

    public void setPcPatron(Double pcPatron) {
        this.pcPatron = pcPatron;
    }

    public Double getPcAsegurado() {
        return pcAsegurado;
    }

    public void setPcAsegurado(Double pcAsegurado) {
        this.pcAsegurado = pcAsegurado;
    }

    public Double getPatron() {
        return patron;
    }

    public void setPatron(Double patron) {
        this.patron = patron;
    }

    public Double getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Double asegurado) {
        this.asegurado = asegurado;
    }

    public void doCalc(Double base) {
        patron = base * (pcPatron != null ? pcPatron : 0);
        asegurado = base * (pcAsegurado != null ? pcAsegurado : 0);
        pcSuma = (pcPatron != null ? pcPatron : 0)
                + (pcAsegurado != null ? pcAsegurado : 0);
        suma = patron + asegurado;
    }

    public Double getPcSuma() {
        return pcSuma;
    }

    public void setPcSuma(Double pcSuma) {
        this.pcSuma = pcSuma;
    }

    public Double getSuma() {
        return suma;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

}
