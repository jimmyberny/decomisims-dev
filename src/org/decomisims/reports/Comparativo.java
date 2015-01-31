package org.decomisims.reports;

import java.io.Serializable;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class Comparativo implements Serializable {

    private static final long serialVersionUID = 1123581321L;

    private String nombreCompleto;
    private Integer dias;
    private Double salarioDiario;
    private Double salario;

    public Comparativo() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(Double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
