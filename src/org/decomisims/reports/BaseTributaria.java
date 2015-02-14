package org.decomisims.reports;

import java.io.Serializable;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class BaseTributaria implements Serializable {

    private static final long serialVersionUID = 1123581321L;

    private String nombre;
    private Double patron;
    private Double asegurado;

    public BaseTributaria() {
    }

    public BaseTributaria(String nombre, Double patron, Double asegurado) {
        this.nombre = nombre;
        this.patron = patron;
        this.asegurado = asegurado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Double getTotal() {
        return patron + asegurado;
    }

}
