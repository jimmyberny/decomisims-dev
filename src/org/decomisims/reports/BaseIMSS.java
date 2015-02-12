/*
 */
package org.decomisims.reports;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class BaseIMSS {
    
    private Integer vacaciones;
    private Double prima;
    private Integer aguinaldo;

    public Integer getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Integer vacaciones) {
        this.vacaciones = vacaciones;
    }

    public Double getPrima() {
        return prima;
    }

    public void setPrima(Double prima) {
        this.prima = prima;
    }

    public Integer getAguinaldo() {
        return aguinaldo;
    }

    public void setAguinaldo(Integer aguinaldo) {
        this.aguinaldo = aguinaldo;
    }
    
   private Double getPrimaDias() {
       return vacaciones * prima;
   }
   
   private Double getTotalDias() {
       return 365 + aguinaldo + vacaciones + getPrimaDias();
   }
   
   private Double getFactor() {
       return getTotalDias() / 365;
   }
}
