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
    private Integer horas;
    private Integer horasExentas;
    private Integer horasGravadas;
    private Double salarioHora;
    private Double totalHorasExentas;
    private Double totalHorasGravadas;
    private Double premioAsistencia;
    private Double ayudaHabitacion;
    private Double ayudaComedor;
    private Double valesDespensa;
    private Double valesGasolina;
    private Double ingresoExento;
    private Double ingresoGravado;
    private Double ingresoBruto;
    private Double ingresoNeto;
    private Double limiteInferior;
    private Double limiteSuperior;
    private Double excedente;
    private Double cuota;
    private Double ingresoExcedente;
    private Double cuotaExcedente;
    private Double retencion;
    private Double patron;
    private Double asegurado;
    private Double ISR;

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

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getHorasExentas() {
        return horasExentas;
    }

    public void setHorasExentas(Integer horasExentas) {
        this.horasExentas = horasExentas;
    }

    public Integer getHorasGravadas() {
        return horasGravadas;
    }

    public void setHorasGravadas(Integer horasGravadas) {
        this.horasGravadas = horasGravadas;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Double getTotalHorasExentas() {
        return totalHorasExentas;
    }

    public void setTotalHorasExentas(Double totalHorasExentas) {
        this.totalHorasExentas = totalHorasExentas;
    }

    public Double getTotalHorasGravadas() {
        return totalHorasGravadas;
    }

    public void setTotalHorasGravadas(Double totalHorasGravadas) {
        this.totalHorasGravadas = totalHorasGravadas;
    }

    public Double getPremioAsistencia() {
        return premioAsistencia;
    }

    public void setPremioAsistencia(Double premioAsistencia) {
        this.premioAsistencia = premioAsistencia;
    }

    public Double getAyudaHabitacion() {
        return ayudaHabitacion;
    }

    public void setAyudaHabitacion(Double ayudaHabitacion) {
        this.ayudaHabitacion = ayudaHabitacion;
    }

    public Double getAyudaComedor() {
        return ayudaComedor;
    }

    public void setAyudaComedor(Double ayudaComedor) {
        this.ayudaComedor = ayudaComedor;
    }

    public Double getValesDespensa() {
        return valesDespensa;
    }

    public void setValesDespensa(Double valesDespensa) {
        this.valesDespensa = valesDespensa;
    }

    public Double getValesGasolina() {
        return valesGasolina;
    }

    public void setValesGasolina(Double valesGasolina) {
        this.valesGasolina = valesGasolina;
    }

    public Double getIngresoExento() {
        return ingresoExento;
    }

    public void setIngresoExento(Double ingresoExento) {
        this.ingresoExento = ingresoExento;
    }

    public Double getIngresoGravado() {
        return ingresoGravado;
    }

    public void setIngresoGravado(Double ingresoGravado) {
        this.ingresoGravado = ingresoGravado;
    }

    public Double getIngresoBruto() {
        return ingresoBruto;
    }

    public void setIngresoBruto(Double ingresoBruto) {
        this.ingresoBruto = ingresoBruto;
    }

    public Double getIngresoNeto() {
        return ingresoNeto;
    }

    public void setIngresoNeto(Double ingresoNeto) {
        this.ingresoNeto = ingresoNeto;
    }

    public Double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(Double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(Double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public Double getExcedente() {
        return excedente;
    }

    public void setExcedente(Double excedente) {
        this.excedente = excedente;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    public Double getIngresoExcedente() {
        return ingresoExcedente;
    }

    public void setIngresoExcedente(Double ingresoExcedente) {
        this.ingresoExcedente = ingresoExcedente;
    }

    public Double getCuotaExcedente() {
        return cuotaExcedente;
    }

    public void setCuotaExcedente(Double cuotaExcedente) {
        this.cuotaExcedente = cuotaExcedente;
    }

    public Double getRetencion() {
        return retencion;
    }

    public void setRetencion(Double retencion) {
        this.retencion = retencion;
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

    public Double getISR() {
        return ISR;
    }

    public void setISR(Double ISR) {
        this.ISR = ISR;
    }

}
