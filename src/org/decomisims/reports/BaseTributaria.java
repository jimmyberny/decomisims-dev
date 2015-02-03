package org.decomisims.reports;

import java.io.Serializable;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class BaseTributaria implements Serializable {

    private static final long serialVersionUID = 1123581321L;

    private String nombre;
    private Double valor;

    public BaseTributaria() {
    }

    public BaseTributaria(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
