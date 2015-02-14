/*
 */
package org.decomisims.reports;

import java.util.List;
import org.decomisims.modelo.RamoISR;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class BaseIMSS {

    private Integer antiguedad;
    private Double prima;
    private Integer diasVacaciones;
    private Double diasPrima;
    private Integer diasAguinaldo;
    private Double totalDias;
    private Integer diasBase;
    private Double factor;

    private Double asistencia;
    private Double habitacion;
    private Double habitacionCobro;
    private Double habitacionIntegrado;
    private Double comedor;
    private Double comedorCobro;
    private Double comedorIntegrado;
    private Double despensa;
    private Double despensaIntegrado;
    private Double gasolina;
    private Integer horas;
    private Integer horasExcedentes;
    private Double horasIntegrado;
    private Double variableMensual;
    private Double variableBimestral;
    private Double variableDiario;
    private Double salarioDiario;
    private Double salarioBase;
    private Double salarioIntegrado;
    private Double salarioBaseCotizacion;

    private Double salario;
    private Double deduccion;
    private Double ingresoBruto;
    private Double ingresoNeto;
    private List<RamoISR> ramos;
    private Double patron;
    private Double asegurado;

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double getPrima() {
        return prima;
    }

    public void setPrima(Double prima) {
        this.prima = prima;
    }

    public Integer getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(Integer diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public Double getDiasPrima() {
        return diasPrima;
    }

    public void setDiasPrima(Double diasPrima) {
        this.diasPrima = diasPrima;
    }

    public Integer getDiasAguinaldo() {
        return diasAguinaldo;
    }

    public void setDiasAguinaldo(Integer diasAguinaldo) {
        this.diasAguinaldo = diasAguinaldo;
    }

    public Double getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(Double totalDias) {
        this.totalDias = totalDias;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Double asistencia) {
        this.asistencia = asistencia;
    }

    public Double getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Double habitacion) {
        this.habitacion = habitacion;
    }

    public Double getHabitacionCobro() {
        return habitacionCobro;
    }

    public void setHabitacionCobro(Double habitacionCobro) {
        this.habitacionCobro = habitacionCobro;
    }

    public Double getHabitacionIntegrado() {
        return habitacionIntegrado;
    }

    public void setHabitacionIntegrado(Double habitacionIntegrado) {
        this.habitacionIntegrado = habitacionIntegrado;
    }

    public Double getComedor() {
        return comedor;
    }

    public void setComedor(Double comedor) {
        this.comedor = comedor;
    }

    public Double getComedorCobro() {
        return comedorCobro;
    }

    public void setComedorCobro(Double comedorCobro) {
        this.comedorCobro = comedorCobro;
    }

    public Double getComedorIntegrado() {
        return comedorIntegrado;
    }

    public void setComedorIntegrado(Double comedorIntegrado) {
        this.comedorIntegrado = comedorIntegrado;
    }

    public Double getDespensa() {
        return despensa;
    }

    public void setDespensa(Double despensa) {
        this.despensa = despensa;
    }

    public Double getDespensaIntegrado() {
        return despensaIntegrado;
    }

    public void setDespensaIntegrado(Double despensaIntegrado) {
        this.despensaIntegrado = despensaIntegrado;
    }

    public Double getGasolina() {
        return gasolina;
    }

    public void setGasolina(Double gasolina) {
        this.gasolina = gasolina;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getHorasExcedentes() {
        return horasExcedentes;
    }

    public void setHorasExcedentes(Integer horasExcedentes) {
        this.horasExcedentes = horasExcedentes;
    }

    public Double getHorasIntegrado() {
        return horasIntegrado;
    }

    public void setHorasIntegrado(Double horasIntegrado) {
        this.horasIntegrado = horasIntegrado;
    }

    public Double getVariableMensual() {
        return variableMensual;
    }

    public void setVariableMensual(Double variableMensual) {
        this.variableMensual = variableMensual;
    }

    public Double getVariableBimestral() {
        return variableBimestral;
    }

    public void setVariableBimestral(Double variableBimestral) {
        this.variableBimestral = variableBimestral;
    }

    public Double getVariableDiario() {
        return variableDiario;
    }

    public void setVariableDiario(Double variableDiario) {
        this.variableDiario = variableDiario;
    }

    public Double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(Double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getSalarioIntegrado() {
        return salarioIntegrado;
    }

    public void setSalarioIntegrado(Double salarioIntegrado) {
        this.salarioIntegrado = salarioIntegrado;
    }

    public Double getSalarioBaseCotizacion() {
        return salarioBaseCotizacion;
    }

    public void setSalarioBaseCotizacion(Double salarioBaseCotizacion) {
        this.salarioBaseCotizacion = salarioBaseCotizacion;
    }

    public Double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(Double deduccion) {
        this.deduccion = deduccion;
    }

    public Double getIngresoNeto() {
        return ingresoNeto;
    }

    public void setIngresoNeto(Double ingresoNeto) {
        this.ingresoNeto = ingresoNeto;
    }

    public Integer getDiasBase() {
        return diasBase;
    }

    public void setDiasBase(Integer diasBase) {
        this.diasBase = diasBase;
    }

    public List<RamoISR> getRamos() {
        return ramos;
    }

    public void setRamos(List<RamoISR> ramos) {
        this.ramos = ramos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getIngresoBruto() {
        return ingresoBruto;
    }

    public void setIngresoBruto(Double ingresoBruto) {
        this.ingresoBruto = ingresoBruto;
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

}
