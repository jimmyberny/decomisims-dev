/*
 */
package org.decomisims.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class RamosISREngine {

    private final List<RamoISR> res;
    private Double patron;
    private Double asegurado;

    public RamosISREngine(Double gravado) {
        // Do calcs
        res = new ArrayList<RamoISR>(5);
        RamoISR tmp = new RamoISR();
        tmp.setNombre("CF * S/1SMDF");
        tmp.setPcPatron(0.204);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Excedente a 3 SMGDF");
        tmp.setPcPatron(0.011);
        tmp.setPcAsegurado(0.004);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Prestaciones en dinero");
        tmp.setPcPatron(0.007);
        tmp.setPcAsegurado(0.0025);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Gastos medicos pensionados");
        tmp.setPcPatron(0.0105);
        tmp.setPcAsegurado(0.00375);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Invalidez y vida");
        tmp.setPcPatron(0.0175);
        tmp.setPcAsegurado(0.00625);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Guarderias");
        tmp.setPcPatron(0.01);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Retiro");
        tmp.setPcPatron(0.02);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("Avanzada y vejez");
        tmp.setPcPatron(0.0315);
        tmp.setPcAsegurado(0.01125);
        res.add(tmp);

        tmp = new RamoISR();
        tmp.setNombre("");
        tmp.setPcPatron(0.0965);
        tmp.setPcAsegurado(0.02375);
        res.add(tmp);

        patron = 0d;
        asegurado = 0d;
        for (RamoISR ramo : res) {
            ramo.doCalc(gravado);
            patron += ramo.getPatron();
            asegurado += ramo.getAsegurado();
        }

    }

    public List<RamoISR> getRamos() {
        return res;
    }

    public Double getPatron() {
        return patron;
    }

    public Double getAsegurado() {
        return asegurado;
    }

}
