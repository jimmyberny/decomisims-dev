package org.decomisims.vistas;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import org.decomisims.app.Aplicacion;
import org.decomisims.app.Vista;
import org.decomisims.error.AppError;
import org.decomisims.error.AppException;
import org.decomisims.modelo.ISREngine;
import org.decomisims.modelo.RangoISR;
import org.decomisims.reports.BaseTributaria;
import org.decomisims.reports.Comparativo;
import org.decomisims.util.Format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class Home extends javax.swing.JPanel implements Vista {

    private static final long serialVersionUID = 1123581321L;
    private static final Logger log = LoggerFactory.getLogger(Home.class);
    private Aplicacion app;

    public Home() {
        initComponents();
        Format.setPercentFormat("0.00%");
    }

    @Override
    public void init(Aplicacion app) throws AppError {
        this.app = app;
        try {
            URL res = getClass().getResource("bienvenida.html");
            jepContenido.setPage(res);

            URL var = getClass().getResource("variables.html");
            jepVariables.setPage(var);
        } catch (IOException ex) {
            log.error(ex.getMessage(), ex);
        }

        // Opciones generales
        ogGenerales.init(app);

        // Contenido
        conceptos.init(app, ogGenerales);
    }

    @Override
    public void mostrar() throws AppError {

    }

    @Override
    public boolean cerrar() {
        return true;
    }

    @Override
    public JPanel getContenido() {
        return this;
    }

    private File seleccionarArchivo() {
        File sel = null;
        String home = System.getProperty("user.home");
        // Get user home
        JFileChooser chooser = new JFileChooser(home);
        if (JFileChooser.APPROVE_OPTION == chooser.showSaveDialog(this)) {
            sel = chooser.getSelectedFile();
            try {
                log.info("{}, {}, {}", sel.getCanonicalPath(), sel.isFile(), sel.exists());
            } catch (IOException ex) {
                log.error(ex.getMessage(), ex);
            }
        }

        return sel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMain = new javax.swing.JTabbedPane();
        jpConceptos = new javax.swing.JPanel();
        conceptos = new org.decomisims.vistas.Conceptos();
        jpControles = new javax.swing.JPanel();
        jbGenerarReporte = new javax.swing.JButton();
        jspConceptos = new javax.swing.JScrollPane();
        jepContenido = new javax.swing.JEditorPane();
        jspVariables = new javax.swing.JScrollPane();
        jepVariables = new javax.swing.JEditorPane();
        jrComp = new org.decomisims.reports.JRComparativo();
        ogGenerales = new org.decomisims.vistas.OpcionesGenerales();

        setLayout(new java.awt.BorderLayout());

        jtpMain.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jpConceptos.setLayout(new java.awt.BorderLayout());
        jpConceptos.add(conceptos, java.awt.BorderLayout.NORTH);

        jbGenerarReporte.setText("Generar reporte");
        jbGenerarReporte.setPreferredSize(new java.awt.Dimension(180, 28));
        jbGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarReporteActionPerformed(evt);
            }
        });
        jpControles.add(jbGenerarReporte);

        jpConceptos.add(jpControles, java.awt.BorderLayout.CENTER);

        jtpMain.addTab("Decomisims", jpConceptos);

        jepContenido.setEditable(false);
        jspConceptos.setViewportView(jepContenido);

        jtpMain.addTab("Conceptos", jspConceptos);

        jspVariables.setViewportView(jepVariables);

        jtpMain.addTab("Variables", jspVariables);
        jtpMain.addTab("Comparativo", jrComp);

        add(jtpMain, java.awt.BorderLayout.CENTER);
        add(ogGenerales, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarReporteActionPerformed
        //
        try {
            Comparativo comp = new Comparativo();
            comp.setNombreCompleto(conceptos.getNombre());
            comp.setSalarioDiario(conceptos.getSalario());
            comp.setDias(conceptos.getDias());
            
            // Calculo de horas extra
            HorasExtra extras = conceptos.getHoras();
            Integer hExentas = extras.getHorasExentas();
            Integer hGravadas = extras.getHorasGravadas();
            Integer hTots = hExentas + hGravadas;
            comp.setHoras(hTots);
            comp.setSalarioHora(extras.getSalarioHora());
            comp.setHorasExentas(hExentas);
            comp.setHorasGravadas(hGravadas);
            comp.setTotalHorasExentas(extras.getExcento());
            comp.setTotalHorasGravadas(extras.getGravado());
            
            // Asistencia
            comp.setPremioAsistencia(conceptos.getPremioAsistencia());
            
            comp.setAyudaHabitacion(conceptos.getAyudaHabitacion());
            comp.setAyudaComedor(conceptos.getAyudaComedor());
            comp.setValesDespensa(conceptos.getValesDespensa());
            comp.setValesGasolina(conceptos.getValesGasolina());

            // Determinar el valor de ISR
            // Sumar horas gravadas
            Double ingresoExento = 0d;
            ingresoExento += comp.getTotalHorasExentas();

            Double ingresoGravado = comp.getSalarioDiario() * comp.getDias();
            ingresoGravado += comp.getTotalHorasGravadas();
            ingresoGravado += comp.getPremioAsistencia();
            ingresoGravado += comp.getAyudaHabitacion();
            ingresoGravado += comp.getAyudaComedor();
            ingresoGravado += comp.getValesDespensa();
            ingresoGravado += comp.getValesGasolina();
            comp.setIngresoExento(ingresoExento);
            comp.setIngresoGravado(ingresoGravado);
            comp.setIngresoBruto(ingresoGravado + ingresoExento);
            // ISR
            RangoISR rango = ISREngine.ESCALA.getRango(ingresoGravado);
            comp.setLimiteInferior(rango.getMin());
            comp.setLimiteSuperior(rango.getMax());
            comp.setExcedente(rango.getExcedente()); // Porcentaje excedente
            comp.setCuota(rango.getCuota());
            comp.setIngresoExcedente(ingresoGravado - comp.getLimiteInferior());
            comp.setCuotaExcedente(comp.getIngresoExcedente() * comp.getExcedente());
            comp.setRetencion(comp.getCuota() + comp.getCuotaExcedente());
            comp.setIngresoNeto(comp.getIngresoBruto() - comp.getRetencion());
            
            
            // Grafica
            List<BaseTributaria> res = new ArrayList<>(3);
            res.add(new BaseTributaria("ISR", 1245d));
            res.add(new BaseTributaria("IMSS Mínimas", 1145d));
            res.add(new BaseTributaria("IMSS Superiores", 1345d));

            // Report, render, show
            jrComp.doReport(comp, res);
            
            
            jtpMain.getModel().setSelectedIndex(3);
        } catch (AppException apex) {
            log.error(apex.getMessage(), apex);
        }
    }//GEN-LAST:event_jbGenerarReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.decomisims.vistas.Conceptos conceptos;
    private javax.swing.JButton jbGenerarReporte;
    private javax.swing.JEditorPane jepContenido;
    private javax.swing.JEditorPane jepVariables;
    private javax.swing.JPanel jpConceptos;
    private javax.swing.JPanel jpControles;
    private org.decomisims.reports.JRComparativo jrComp;
    private javax.swing.JScrollPane jspConceptos;
    private javax.swing.JScrollPane jspVariables;
    private javax.swing.JTabbedPane jtpMain;
    private org.decomisims.vistas.OpcionesGenerales ogGenerales;
    // End of variables declaration//GEN-END:variables
}
